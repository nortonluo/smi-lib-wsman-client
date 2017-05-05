/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.31 at 06:09:44 PM CST 
//

package com.dell.isg.smi.wsmanclient.wsman.errormessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}MESSAGE_ID"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}MESSAGE_DESCRIPTION"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}MESSAGE_COMPONENTS"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}FIXED_MESSAGE_INSTANCE_VALUES"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NAME" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BIOS001"/>
 *             &lt;enumeration value="BIOS002"/>
 *             &lt;enumeration value="BIOS003"/>
 *             &lt;enumeration value="BIOS004"/>
 *             &lt;enumeration value="BIOS005"/>
 *             &lt;enumeration value="BIOS006"/>
 *             &lt;enumeration value="BIOS007"/>
 *             &lt;enumeration value="BIOS008"/>
 *             &lt;enumeration value="BIOS009"/>
 *             &lt;enumeration value="BIOS010"/>
 *             &lt;enumeration value="BIOS011"/>
 *             &lt;enumeration value="BIOS012"/>
 *             &lt;enumeration value="BIOS013"/>
 *             &lt;enumeration value="BIOS014"/>
 *             &lt;enumeration value="BIOS015"/>
 *             &lt;enumeration value="BIOS016"/>
 *             &lt;enumeration value="BIOS017"/>
 *             &lt;enumeration value="BOOT001"/>
 *             &lt;enumeration value="BOOT002"/>
 *             &lt;enumeration value="BOOT003"/>
 *             &lt;enumeration value="BOOT004"/>
 *             &lt;enumeration value="BOOT005"/>
 *             &lt;enumeration value="BOOT006"/>
 *             &lt;enumeration value="BOOT007"/>
 *             &lt;enumeration value="BOOT008"/>
 *             &lt;enumeration value="BOOT009"/>
 *             &lt;enumeration value="BOOT010"/>
 *             &lt;enumeration value="BOOT011"/>
 *             &lt;enumeration value="BOOT012"/>
 *             &lt;enumeration value="BOOT014"/>
 *             &lt;enumeration value="DH001"/>
 *             &lt;enumeration value="DH002"/>
 *             &lt;enumeration value="DH003"/>
 *             &lt;enumeration value="DH004"/>
 *             &lt;enumeration value="DH005"/>
 *             &lt;enumeration value="DH006"/>
 *             &lt;enumeration value="DH007"/>
 *             &lt;enumeration value="DH008"/>
 *             &lt;enumeration value="DH009"/>
 *             &lt;enumeration value="JCP001"/>
 *             &lt;enumeration value="JCP002"/>
 *             &lt;enumeration value="JCP003"/>
 *             &lt;enumeration value="JCP004"/>
 *             &lt;enumeration value="JCP005"/>
 *             &lt;enumeration value="LC001"/>
 *             &lt;enumeration value="LC002"/>
 *             &lt;enumeration value="LC003"/>
 *             &lt;enumeration value="LC004"/>
 *             &lt;enumeration value="LC005"/>
 *             &lt;enumeration value="LC006"/>
 *             &lt;enumeration value="LC007"/>
 *             &lt;enumeration value="LC008"/>
 *             &lt;enumeration value="LC009"/>
 *             &lt;enumeration value="LC010"/>
 *             &lt;enumeration value="LC011"/>
 *             &lt;enumeration value="LC012"/>
 *             &lt;enumeration value="LC013"/>
 *             &lt;enumeration value="LC014"/>
 *             &lt;enumeration value="LC015"/>
 *             &lt;enumeration value="LC016"/>
 *             &lt;enumeration value="LC017"/>
 *             &lt;enumeration value="LC018"/>
 *             &lt;enumeration value="LC019"/>
 *             &lt;enumeration value="LC020"/>
 *             &lt;enumeration value="LC021"/>
 *             &lt;enumeration value="LC022"/>
 *             &lt;enumeration value="LC023"/>
 *             &lt;enumeration value="LC024"/>
 *             &lt;enumeration value="LC025"/>
 *             &lt;enumeration value="LC026"/>
 *             &lt;enumeration value="LC027"/>
 *             &lt;enumeration value="LC028"/>
 *             &lt;enumeration value="LC029"/>
 *             &lt;enumeration value="LC030"/>
 *             &lt;enumeration value="LC031"/>
 *             &lt;enumeration value="LC032"/>
 *             &lt;enumeration value="LC033"/>
 *             &lt;enumeration value="LC034"/>
 *             &lt;enumeration value="LC035"/>
 *             &lt;enumeration value="LC036"/>
 *             &lt;enumeration value="LC037"/>
 *             &lt;enumeration value="LC038"/>
 *             &lt;enumeration value="LC039"/>
 *             &lt;enumeration value="LC040"/>
 *             &lt;enumeration value="NIC001"/>
 *             &lt;enumeration value="NIC002"/>
 *             &lt;enumeration value="NIC003"/>
 *             &lt;enumeration value="NIC004"/>
 *             &lt;enumeration value="NIC005"/>
 *             &lt;enumeration value="NIC006"/>
 *             &lt;enumeration value="NIC007"/>
 *             &lt;enumeration value="NIC008"/>
 *             &lt;enumeration value="NIC009"/>
 *             &lt;enumeration value="NIC010"/>
 *             &lt;enumeration value="NIC011"/>
 *             &lt;enumeration value="NIC012"/>
 *             &lt;enumeration value="NIC013"/>
 *             &lt;enumeration value="NIC014"/>
 *             &lt;enumeration value="NIC015"/>
 *             &lt;enumeration value="NIC016"/>
 *             &lt;enumeration value="OSD1"/>
 *             &lt;enumeration value="OSD10"/>
 *             &lt;enumeration value="OSD11"/>
 *             &lt;enumeration value="OSD12"/>
 *             &lt;enumeration value="OSD13"/>
 *             &lt;enumeration value="OSD14"/>
 *             &lt;enumeration value="OSD15"/>
 *             &lt;enumeration value="OSD16"/>
 *             &lt;enumeration value="OSD17"/>
 *             &lt;enumeration value="OSD18"/>
 *             &lt;enumeration value="OSD19"/>
 *             &lt;enumeration value="OSD2"/>
 *             &lt;enumeration value="OSD20"/>
 *             &lt;enumeration value="OSD21"/>
 *             &lt;enumeration value="OSD22"/>
 *             &lt;enumeration value="OSD23"/>
 *             &lt;enumeration value="OSD24"/>
 *             &lt;enumeration value="OSD25"/>
 *             &lt;enumeration value="OSD26"/>
 *             &lt;enumeration value="OSD27"/>
 *             &lt;enumeration value="OSD28"/>
 *             &lt;enumeration value="OSD29"/>
 *             &lt;enumeration value="OSD3"/>
 *             &lt;enumeration value="OSD30"/>
 *             &lt;enumeration value="OSD31"/>
 *             &lt;enumeration value="OSD32"/>
 *             &lt;enumeration value="OSD33"/>
 *             &lt;enumeration value="OSD34"/>
 *             &lt;enumeration value="OSD35"/>
 *             &lt;enumeration value="OSD36"/>
 *             &lt;enumeration value="OSD37"/>
 *             &lt;enumeration value="OSD38"/>
 *             &lt;enumeration value="OSD39"/>
 *             &lt;enumeration value="OSD4"/>
 *             &lt;enumeration value="OSD40"/>
 *             &lt;enumeration value="OSD41"/>
 *             &lt;enumeration value="OSD42"/>
 *             &lt;enumeration value="OSD43"/>
 *             &lt;enumeration value="OSD44"/>
 *             &lt;enumeration value="OSD45"/>
 *             &lt;enumeration value="OSD46"/>
 *             &lt;enumeration value="OSD47"/>
 *             &lt;enumeration value="OSD48"/>
 *             &lt;enumeration value="OSD49"/>
 *             &lt;enumeration value="OSD5"/>
 *             &lt;enumeration value="OSD50"/>
 *             &lt;enumeration value="OSD51"/>
 *             &lt;enumeration value="OSD52"/>
 *             &lt;enumeration value="OSD53"/>
 *             &lt;enumeration value="OSD54"/>
 *             &lt;enumeration value="OSD55"/>
 *             &lt;enumeration value="OSD6"/>
 *             &lt;enumeration value="OSD7"/>
 *             &lt;enumeration value="OSD8"/>
 *             &lt;enumeration value="OSD9"/>
 *             &lt;enumeration value="PR1"/>
 *             &lt;enumeration value="PR10"/>
 *             &lt;enumeration value="PR11"/>
 *             &lt;enumeration value="PR12"/>
 *             &lt;enumeration value="PR13"/>
 *             &lt;enumeration value="PR14"/>
 *             &lt;enumeration value="PR15"/>
 *             &lt;enumeration value="PR16"/>
 *             &lt;enumeration value="PR17"/>
 *             &lt;enumeration value="PR18"/>
 *             &lt;enumeration value="PR19"/>
 *             &lt;enumeration value="PR2"/>
 *             &lt;enumeration value="PR20"/>
 *             &lt;enumeration value="PR21"/>
 *             &lt;enumeration value="PR22"/>
 *             &lt;enumeration value="PR23"/>
 *             &lt;enumeration value="PR24"/>
 *             &lt;enumeration value="PR25"/>
 *             &lt;enumeration value="PR26"/>
 *             &lt;enumeration value="PR27"/>
 *             &lt;enumeration value="PR28"/>
 *             &lt;enumeration value="PR29"/>
 *             &lt;enumeration value="PR3"/>
 *             &lt;enumeration value="PR30"/>
 *             &lt;enumeration value="PR31"/>
 *             &lt;enumeration value="PR32"/>
 *             &lt;enumeration value="PR4"/>
 *             &lt;enumeration value="PR5"/>
 *             &lt;enumeration value="PR6"/>
 *             &lt;enumeration value="PR7"/>
 *             &lt;enumeration value="PR8"/>
 *             &lt;enumeration value="PR9"/>
 *             &lt;enumeration value="RED001"/>
 *             &lt;enumeration value="RED002"/>
 *             &lt;enumeration value="RED003"/>
 *             &lt;enumeration value="RED004"/>
 *             &lt;enumeration value="RED005"/>
 *             &lt;enumeration value="RED006"/>
 *             &lt;enumeration value="RED007"/>
 *             &lt;enumeration value="RED008"/>
 *             &lt;enumeration value="RED009"/>
 *             &lt;enumeration value="RED010"/>
 *             &lt;enumeration value="RED011"/>
 *             &lt;enumeration value="RED012"/>
 *             &lt;enumeration value="RED013"/>
 *             &lt;enumeration value="RED014"/>
 *             &lt;enumeration value="RED015"/>
 *             &lt;enumeration value="RED016"/>
 *             &lt;enumeration value="RED017"/>
 *             &lt;enumeration value="RED018"/>
 *             &lt;enumeration value="RED019"/>
 *             &lt;enumeration value="RED020"/>
 *             &lt;enumeration value="STOR003"/>
 *             &lt;enumeration value="STOR004"/>
 *             &lt;enumeration value="STOR006"/>
 *             &lt;enumeration value="STOR007"/>
 *             &lt;enumeration value="STOR009"/>
 *             &lt;enumeration value="STOR010"/>
 *             &lt;enumeration value="STOR011"/>
 *             &lt;enumeration value="STOR012"/>
 *             &lt;enumeration value="STOR013"/>
 *             &lt;enumeration value="STOR015"/>
 *             &lt;enumeration value="STOR016"/>
 *             &lt;enumeration value="STOR017"/>
 *             &lt;enumeration value="STOR018"/>
 *             &lt;enumeration value="STOR019"/>
 *             &lt;enumeration value="STOR020"/>
 *             &lt;enumeration value="STOR021"/>
 *             &lt;enumeration value="STOR022"/>
 *             &lt;enumeration value="STOR023"/>
 *             &lt;enumeration value="STOR024"/>
 *             &lt;enumeration value="STOR025"/>
 *             &lt;enumeration value="STOR026"/>
 *             &lt;enumeration value="STOR027"/>
 *             &lt;enumeration value="STOR028"/>
 *             &lt;enumeration value="STOR029"/>
 *             &lt;enumeration value="STOR030"/>
 *             &lt;enumeration value="STOR031"/>
 *             &lt;enumeration value="STOR032"/>
 *             &lt;enumeration value="STOR033"/>
 *             &lt;enumeration value="STOR034"/>
 *             &lt;enumeration value="STOR035"/>
 *             &lt;enumeration value="SUP001"/>
 *             &lt;enumeration value="SUP002"/>
 *             &lt;enumeration value="SUP003"/>
 *             &lt;enumeration value="SUP005"/>
 *             &lt;enumeration value="SUP006"/>
 *             &lt;enumeration value="SUP007"/>
 *             &lt;enumeration value="SUP009"/>
 *             &lt;enumeration value="SUP011"/>
 *             &lt;enumeration value="SUP013"/>
 *             &lt;enumeration value="SUP014"/>
 *             &lt;enumeration value="SUP015"/>
 *             &lt;enumeration value="SUP016"/>
 *             &lt;enumeration value="SUP017"/>
 *             &lt;enumeration value="SUP018"/>
 *             &lt;enumeration value="SUP019"/>
 *             &lt;enumeration value="SUP020"/>
 *             &lt;enumeration value="SUP021"/>
 *             &lt;enumeration value="SUP022"/>
 *             &lt;enumeration value="SUP023"/>
 *             &lt;enumeration value="SUP024"/>
 *             &lt;enumeration value="VF001"/>
 *             &lt;enumeration value="VF002"/>
 *             &lt;enumeration value="VF003"/>
 *             &lt;enumeration value="VF004"/>
 *             &lt;enumeration value="VF005"/>
 *             &lt;enumeration value="VF006"/>
 *             &lt;enumeration value="VF007"/>
 *             &lt;enumeration value="VF008"/>
 *             &lt;enumeration value="VF009"/>
 *             &lt;enumeration value="VF010"/>
 *             &lt;enumeration value="VF011"/>
 *             &lt;enumeration value="VF012"/>
 *             &lt;enumeration value="VF013"/>
 *             &lt;enumeration value="VF014"/>
 *             &lt;enumeration value="VF015"/>
 *             &lt;enumeration value="VF016"/>
 *             &lt;enumeration value="VF017"/>
 *             &lt;enumeration value="VF018"/>
 *             &lt;enumeration value="VF019"/>
 *             &lt;enumeration value="VF020"/>
 *             &lt;enumeration value="VF021"/>
 *             &lt;enumeration value="VF022"/>
 *             &lt;enumeration value="VF023"/>
 *             &lt;enumeration value="VF024"/>
 *             &lt;enumeration value="VF025"/>
 *             &lt;enumeration value="VF026"/>
 *             &lt;enumeration value="VF027"/>
 *             &lt;enumeration value="VF028"/>
 *             &lt;enumeration value="VF029"/>
 *             &lt;enumeration value="VF030"/>
 *             &lt;enumeration value="VF031"/>
 *             &lt;enumeration value="VF032"/>
 *             &lt;enumeration value="VF033"/>
 *             &lt;enumeration value="VF034"/>
 *             &lt;enumeration value="VF035"/>
 *             &lt;enumeration value="VF036"/>
 *             &lt;enumeration value="VF037"/>
 *             &lt;enumeration value="VF038"/>
 *             &lt;enumeration value="VF039"/>
 *             &lt;enumeration value="VF040"/>
 *             &lt;enumeration value="VF041"/>
 *             &lt;enumeration value="VF042"/>
 *             &lt;enumeration value="VF043"/>
 *             &lt;enumeration value="VF044"/>
 *             &lt;enumeration value="VF045"/>
 *             &lt;enumeration value="VF046"/>
 *             &lt;enumeration value="VF047"/>
 *             &lt;enumeration value="VF048"/>
 *             &lt;enumeration value="VF049"/>
 *             &lt;enumeration value="VF050"/>
 *             &lt;enumeration value="VF051"/>
 *             &lt;enumeration value="VF052"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "messageid", "messagedescription", "messagecomponents", "fixedmessageinstancevalues" })
@XmlRootElement(name = "MESSAGE")
public class MESSAGE {

    @XmlElement(name = "MESSAGE_ID", required = true)
    protected MESSAGEID messageid;
    @XmlElement(name = "MESSAGE_DESCRIPTION", required = true)
    protected String messagedescription;
    @XmlElement(name = "MESSAGE_COMPONENTS", required = true)
    protected MESSAGECOMPONENTS messagecomponents;
    @XmlElement(name = "FIXED_MESSAGE_INSTANCE_VALUES", required = true)
    protected FIXEDMESSAGEINSTANCEVALUES fixedmessageinstancevalues;
    @XmlAttribute(name = "NAME", required = true)
    protected String name;


    /**
     * Gets the value of the messageid property.
     * 
     * @return possible object is {@link MESSAGEID }
     * 
     */
    public MESSAGEID getMESSAGEID() {
        return messageid;
    }


    /**
     * Sets the value of the messageid property.
     * 
     * @param value allowed object is {@link MESSAGEID }
     * 
     */
    public void setMESSAGEID(MESSAGEID value) {
        this.messageid = value;
    }


    /**
     * Gets the value of the messagedescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMESSAGEDESCRIPTION() {
        return messagedescription;
    }


    /**
     * Sets the value of the messagedescription property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMESSAGEDESCRIPTION(String value) {
        this.messagedescription = value;
    }


    /**
     * Gets the value of the messagecomponents property.
     * 
     * @return possible object is {@link MESSAGECOMPONENTS }
     * 
     */
    public MESSAGECOMPONENTS getMESSAGECOMPONENTS() {
        return messagecomponents;
    }


    /**
     * Sets the value of the messagecomponents property.
     * 
     * @param value allowed object is {@link MESSAGECOMPONENTS }
     * 
     */
    public void setMESSAGECOMPONENTS(MESSAGECOMPONENTS value) {
        this.messagecomponents = value;
    }


    /**
     * Gets the value of the fixedmessageinstancevalues property.
     * 
     * @return possible object is {@link FIXEDMESSAGEINSTANCEVALUES }
     * 
     */
    public FIXEDMESSAGEINSTANCEVALUES getFIXEDMESSAGEINSTANCEVALUES() {
        return fixedmessageinstancevalues;
    }


    /**
     * Sets the value of the fixedmessageinstancevalues property.
     * 
     * @param value allowed object is {@link FIXEDMESSAGEINSTANCEVALUES }
     * 
     */
    public void setFIXEDMESSAGEINSTANCEVALUES(FIXEDMESSAGEINSTANCEVALUES value) {
        this.fixedmessageinstancevalues = value;
    }


    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNAME() {
        return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNAME(String value) {
        this.name = value;
    }

}
