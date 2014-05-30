
package serversidepackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeUserRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeUserRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userRow" type="{http://ServerSidePackage/}row" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeUserRow", propOrder = {
    "userRow"
})
public class StoreUserRow {

    protected Row userRow;

    /**
     * Gets the value of the userRow property.
     * 
     * @return
     *     possible object is
     *     {@link Row }
     *     
     */
    public Row getUserRow() {
        return userRow;
    }

    /**
     * Sets the value of the userRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Row }
     *     
     */
    public void setUserRow(Row value) {
        this.userRow = value;
    }

}
