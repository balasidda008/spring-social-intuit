//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * Provides the definition that allows bulk data transfer of Discounts
 * 
 * <p>Java class for Discounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discounts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmCollections">
 *       &lt;sequence>
 *         &lt;element name="Discount" type="{http://www.intuit.com/sb/cdm/v2}Discount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discounts", propOrder = {
    "discount"
})
public class Discounts
    extends CdmCollections
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Discount")
    protected List<Discount> discount;

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discount }
     * 
     * 
     */
    public List<Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<Discount>();
        }
        return this.discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param discount
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setDiscount(List<Discount> discount) {
        this.discount = discount;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Discounts)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Discounts that = ((Discounts) object);
        {
            List<Discount> lhsDiscount;
            lhsDiscount = this.getDiscount();
            List<Discount> rhsDiscount;
            rhsDiscount = that.getDiscount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discount", lhsDiscount), LocatorUtils.property(thatLocator, "discount", rhsDiscount), lhsDiscount, rhsDiscount)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<Discount> theDiscount;
            theDiscount = this.getDiscount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discount", theDiscount), currentHashCode, theDiscount);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
