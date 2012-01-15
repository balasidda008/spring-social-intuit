//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SalesTaxRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTaxRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TaxReferenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTaxRef", propOrder = {
    "taxId",
    "taxName"
})
public class SalesTaxRef
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxId")
    protected IdType taxId;
    @XmlElement(name = "TaxName")
    protected String taxName;

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTaxId(IdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SalesTaxRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SalesTaxRef that = ((SalesTaxRef) object);
        {
            IdType lhsTaxId;
            lhsTaxId = this.getTaxId();
            IdType rhsTaxId;
            rhsTaxId = that.getTaxId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxId", lhsTaxId), LocatorUtils.property(thatLocator, "taxId", rhsTaxId), lhsTaxId, rhsTaxId)) {
                return false;
            }
        }
        {
            String lhsTaxName;
            lhsTaxName = this.getTaxName();
            String rhsTaxName;
            rhsTaxName = that.getTaxName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxName", lhsTaxName), LocatorUtils.property(thatLocator, "taxName", rhsTaxName), lhsTaxName, rhsTaxName)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            IdType theTaxId;
            theTaxId = this.getTaxId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxId", theTaxId), currentHashCode, theTaxId);
        }
        {
            String theTaxName;
            theTaxName = this.getTaxName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxName", theTaxName), currentHashCode, theTaxName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
