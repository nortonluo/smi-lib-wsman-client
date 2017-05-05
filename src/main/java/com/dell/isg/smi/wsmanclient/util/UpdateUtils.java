/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.wsmanclient.util;

//import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dell.isg.smi.wsmanclient.WSManException;
import com.dell.isg.smi.wsmanclient.model.InvokeCmdResponse;

public final class UpdateUtils {
    private UpdateUtils() {
    }

    private static final Logger logger = LoggerFactory.getLogger(UpdateUtils.class);
    protected static final String ERROR_MESSAGE = "Unknown error occurred while processing current request on the iDRAC";
    protected static final String ERROR_MESSAGE_ID = "-1";


    // split into method to eliminate the Cyclomatic complexity of getUpdateJobID
    private static NodeList getSelectors(String xmlSource) throws WSManException {
        if (null == xmlSource || StringUtils.isEmpty(xmlSource))
            return null;
        Document doc = WSManUtils.toDocument(xmlSource);
        if (null == doc)
            return null;
        return doc.getElementsByTagName("wsman:Selector");
    }


    public static String getUpdateJobID(String xmlSource) throws WSManException {

        NodeList selectors = getSelectors(xmlSource);
        if (null == selectors)
            return "";

        for (int i = 0; i < selectors.getLength(); i++) {
            Node selectorNode = selectors.item(i);

            if (selectorNode.hasAttributes()) {
                NamedNodeMap attribs = selectorNode.getAttributes();
                Node attribNode = attribs.getNamedItem("Name");
                if ((attribNode != null) && (attribNode.hasChildNodes())) {
                    Node instanceNode = attribNode.getChildNodes().item(0);
                    if (instanceNode != null) {
                        String instance = instanceNode.getNodeValue();
                        if (instance.equals("InstanceID")) {
                            return selectorNode.getFirstChild().getNodeValue();
                        }
                    }
                }

            }
        }

        return "";
    }


    private static String getNodeValueFromXML(String xmlSource, String nodeName, String uri) {
        if (null == xmlSource || StringUtils.isEmpty(xmlSource))
            return null;
        try {
            Document doc = WSManUtils.toDocument(xmlSource);
            if (null == doc)
                return null;
            NodeList nodeList = doc.getElementsByTagNameNS(uri, nodeName);
            if (nodeList != null && nodeList.getLength() > 0 && nodeList.item(0) != null && nodeList.item(0).getFirstChild() != null)
                return nodeList.item(0).getFirstChild().getNodeValue();

        } catch (Exception e) {
            logger.error(e.getStackTrace().toString());
        }
        return null;
    }


    public static String getMessageID(String xmlSource, String uri) {
        String message = getNodeValueFromXML(xmlSource, "MessageID", uri);
        return message;
    }


    public static String getMessage(String xmlSource, String uri) {
        String message = getNodeValueFromXML(xmlSource, "Message", uri);
        return message;
    }


    public static int getRequestReturnValue(String xml) {
        Document document;
        try {
            document = WSManUtils.toDocument(xml);

            String returnValueString = null;
            NodeList returnElements = (document.getElementsByTagNameNS("*", "ReturnValue"));
            if (returnElements != null && returnElements.getLength() > 0 && returnElements.item(0) != null && returnElements.item(0).getFirstChild() != null) {
                returnValueString = returnElements.item(0).getFirstChild().getNodeValue();
            }
            if (returnValueString != null && StringUtils.isNumeric(returnValueString)) {
                return Integer.parseInt(returnValueString);
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }


    public static InvokeCmdResponse getAsInvokeCmdResponse(String xml, String uri) {
        InvokeCmdResponse response = new InvokeCmdResponse();
        response.setReturnValue(UpdateUtils.getRequestReturnValue(xml));
        response.setMessage(UpdateUtils.getMessage(xml, uri));
        response.setMessageId(UpdateUtils.getMessageID(xml, uri));
        return response;
    }

}
