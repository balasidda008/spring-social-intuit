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
 * <p>Java class for AccountRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.intuit.com/sb/cdm/v2}AccountReferenceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRef", propOrder = {
    "accountId",
    "accountName",
    "accountType"
})
public class AccountRef
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountId")
    protected IdType accountId;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountType")
    protected AccountTypeEnum accountType;

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AccountRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AccountRef that = ((AccountRef) object);
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
