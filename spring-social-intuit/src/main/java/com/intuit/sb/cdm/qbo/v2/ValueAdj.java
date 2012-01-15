//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * <p>Java class for ValueAdj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueAdj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ValueAdjustmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueAdj", propOrder = {
    "newValue",
    "newQty"
})
public class ValueAdj
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NewValue", required = true)
    protected BigDecimal newValue;
    @XmlElement(name = "NewQty")
    protected BigDecimal newQty;

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewValue(BigDecimal value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the newQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewQty() {
        return newQty;
    }

    /**
     * Sets the value of the newQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewQty(BigDecimal value) {
        this.newQty = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValueAdj)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ValueAdj that = ((ValueAdj) object);
        {
            BigDecimal lhsNewValue;
            lhsNewValue = this.getNewValue();
            BigDecimal rhsNewValue;
            rhsNewValue = that.getNewValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newValue", lhsNewValue), LocatorUtils.property(thatLocator, "newValue", rhsNewValue), lhsNewValue, rhsNewValue)) {
                return false;
            }
        }
        {
            BigDecimal lhsNewQty;
            lhsNewQty = this.getNewQty();
            BigDecimal rhsNewQty;
            rhsNewQty = that.getNewQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newQty", lhsNewQty), LocatorUtils.property(thatLocator, "newQty", rhsNewQty), lhsNewQty, rhsNewQty)) {
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
            BigDecimal theNewValue;
            theNewValue = this.getNewValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newValue", theNewValue), currentHashCode, theNewValue);
        }
        {
            BigDecimal theNewQty;
            theNewQty = this.getNewQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newQty", theNewQty), currentHashCode, theNewQty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
