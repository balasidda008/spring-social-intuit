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
 * Financial transaction representing an order (request to purchase) received (by a business) from a customer requesting products or services.
 * 
 * <p>Java class for SalesOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.intuit.com/sb/cdm/v2}SalesOrderHeader" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.intuit.com/sb/cdm/v2}SalesOrderLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxLine" type="{http://www.intuit.com/sb/cdm/v2}TaxLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrder", propOrder = {
    "header",
    "line",
    "taxLine"
})
public class SalesOrder
    extends CdmBase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Header")
    protected SalesOrderHeader header;
    @XmlElement(name = "Line")
    protected List<SalesOrderLine> line;
    @XmlElement(name = "TaxLine")
    protected List<TaxLine> taxLine;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderHeader }
     *     
     */
    public SalesOrderHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderHeader }
     *     
     */
    public void setHeader(SalesOrderHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderLine }
     * 
     * 
     */
    public List<SalesOrderLine> getLine() {
        if (line == null) {
            line = new ArrayList<SalesOrderLine>();
        }
        return this.line;
    }

    /**
     * Gets the value of the taxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxLine }
     * 
     * 
     */
    public List<TaxLine> getTaxLine() {
        if (taxLine == null) {
            taxLine = new ArrayList<TaxLine>();
        }
        return this.taxLine;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param line
     *     allowed object is
     *     {@link SalesOrderLine }
     *     
     */
    public void setLine(List<SalesOrderLine> line) {
        this.line = line;
    }

    /**
     * Sets the value of the taxLine property.
     * 
     * @param taxLine
     *     allowed object is
     *     {@link TaxLine }
     *     
     */
    public void setTaxLine(List<TaxLine> taxLine) {
        this.taxLine = taxLine;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SalesOrder)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SalesOrder that = ((SalesOrder) object);
        {
            SalesOrderHeader lhsHeader;
            lhsHeader = this.getHeader();
            SalesOrderHeader rhsHeader;
            rhsHeader = that.getHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "header", lhsHeader), LocatorUtils.property(thatLocator, "header", rhsHeader), lhsHeader, rhsHeader)) {
                return false;
            }
        }
        {
            List<SalesOrderLine> lhsLine;
            lhsLine = this.getLine();
            List<SalesOrderLine> rhsLine;
            rhsLine = that.getLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line", lhsLine), LocatorUtils.property(thatLocator, "line", rhsLine), lhsLine, rhsLine)) {
                return false;
            }
        }
        {
            List<TaxLine> lhsTaxLine;
            lhsTaxLine = this.getTaxLine();
            List<TaxLine> rhsTaxLine;
            rhsTaxLine = that.getTaxLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxLine", lhsTaxLine), LocatorUtils.property(thatLocator, "taxLine", rhsTaxLine), lhsTaxLine, rhsTaxLine)) {
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
            SalesOrderHeader theHeader;
            theHeader = this.getHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "header", theHeader), currentHashCode, theHeader);
        }
        {
            List<SalesOrderLine> theLine;
            theLine = this.getLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine);
        }
        {
            List<TaxLine> theTaxLine;
            theTaxLine = this.getTaxLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxLine", theTaxLine), currentHashCode, theTaxLine);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
