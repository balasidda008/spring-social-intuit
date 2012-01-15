//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Information that pertains to the entire InventoryAdjustment
 * 
 * <p>Java class for InventoryAdjustmentHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAdjustmentHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}AccountReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}CustomerReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ClassReferenceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAdjustmentHeader", propOrder = {
    "docNumber",
    "txnDate",
    "note",
    "accountId",
    "accountName",
    "accountType",
    "customerId",
    "customerName",
    "classId",
    "className"
})
public class InventoryAdjustmentHeader
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DocNumber")
    protected String docNumber;
    @XmlElement(name = "TxnDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar txnDate;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "AccountId")
    protected IdType accountId;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountType")
    protected AccountTypeEnum accountType;
    @XmlElement(name = "CustomerId")
    protected IdType customerId;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "ClassId")
    protected IdType classId;
    @XmlElement(name = "ClassName")
    protected String className;

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(Calendar value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setAccountId(IdType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeEnum }
     *     
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeEnum }
     *     
     */
    public void setAccountType(AccountTypeEnum value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setCustomerId(IdType value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setClassId(IdType value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InventoryAdjustmentHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InventoryAdjustmentHeader that = ((InventoryAdjustmentHeader) object);
        {
            String lhsDocNumber;
            lhsDocNumber = this.getDocNumber();
            String rhsDocNumber;
            rhsDocNumber = that.getDocNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "docNumber", lhsDocNumber), LocatorUtils.property(thatLocator, "docNumber", rhsDocNumber), lhsDocNumber, rhsDocNumber)) {
                return false;
            }
        }
        {
            Calendar lhsTxnDate;
            lhsTxnDate = this.getTxnDate();
            Calendar rhsTxnDate;
            rhsTxnDate = that.getTxnDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnDate", lhsTxnDate), LocatorUtils.property(thatLocator, "txnDate", rhsTxnDate), lhsTxnDate, rhsTxnDate)) {
                return false;
            }
        }
        {
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        {
            IdType lhsAccountId;
            lhsAccountId = this.getAccountId();
            IdType rhsAccountId;
            rhsAccountId = that.getAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountId", lhsAccountId), LocatorUtils.property(thatLocator, "accountId", rhsAccountId), lhsAccountId, rhsAccountId)) {
                return false;
            }
        }
        {
            String lhsAccountName;
            lhsAccountName = this.getAccountName();
            String rhsAccountName;
            rhsAccountName = that.getAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountName", lhsAccountName), LocatorUtils.property(thatLocator, "accountName", rhsAccountName), lhsAccountName, rhsAccountName)) {
                return false;
            }
        }
        {
            AccountTypeEnum lhsAccountType;
            lhsAccountType = this.getAccountType();
            AccountTypeEnum rhsAccountType;
            rhsAccountType = that.getAccountType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountType", lhsAccountType), LocatorUtils.property(thatLocator, "accountType", rhsAccountType), lhsAccountType, rhsAccountType)) {
                return false;
            }
        }
        {
            IdType lhsCustomerId;
            lhsCustomerId = this.getCustomerId();
            IdType rhsCustomerId;
            rhsCustomerId = that.getCustomerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerId", lhsCustomerId), LocatorUtils.property(thatLocator, "customerId", rhsCustomerId), lhsCustomerId, rhsCustomerId)) {
                return false;
            }
        }
        {
            String lhsCustomerName;
            lhsCustomerName = this.getCustomerName();
            String rhsCustomerName;
            rhsCustomerName = that.getCustomerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerName", lhsCustomerName), LocatorUtils.property(thatLocator, "customerName", rhsCustomerName), lhsCustomerName, rhsCustomerName)) {
                return false;
            }
        }
        {
            IdType lhsClassId;
            lhsClassId = this.getClassId();
            IdType rhsClassId;
            rhsClassId = that.getClassId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classId", lhsClassId), LocatorUtils.property(thatLocator, "classId", rhsClassId), lhsClassId, rhsClassId)) {
                return false;
            }
        }
        {
            String lhsClassName;
            lhsClassName = this.getClassName();
            String rhsClassName;
            rhsClassName = that.getClassName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "className", lhsClassName), LocatorUtils.property(thatLocator, "className", rhsClassName), lhsClassName, rhsClassName)) {
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
            String theDocNumber;
            theDocNumber = this.getDocNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "docNumber", theDocNumber), currentHashCode, theDocNumber);
        }
        {
            Calendar theTxnDate;
            theTxnDate = this.getTxnDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnDate", theTxnDate), currentHashCode, theTxnDate);
        }
        {
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        {
            IdType theAccountId;
            theAccountId = this.getAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountId", theAccountId), currentHashCode, theAccountId);
        }
        {
            String theAccountName;
            theAccountName = this.getAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountName", theAccountName), currentHashCode, theAccountName);
        }
        {
            AccountTypeEnum theAccountType;
            theAccountType = this.getAccountType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountType", theAccountType), currentHashCode, theAccountType);
        }
        {
            IdType theCustomerId;
            theCustomerId = this.getCustomerId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerId", theCustomerId), currentHashCode, theCustomerId);
        }
        {
            String theCustomerName;
            theCustomerName = this.getCustomerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerName", theCustomerName), currentHashCode, theCustomerName);
        }
        {
            IdType theClassId;
            theClassId = this.getClassId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classId", theClassId), currentHashCode, theClassId);
        }
        {
            String theClassName;
            theClassName = this.getClassName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "className", theClassName), currentHashCode, theClassName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
