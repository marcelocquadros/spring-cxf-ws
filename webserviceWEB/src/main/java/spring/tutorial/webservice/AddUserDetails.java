
package spring.tutorial.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addUserDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addUserDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usrDetail" type="{http://webservice.tutorial.spring/}userDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUserDetails", propOrder = {
    "usrDetail"
})
public class AddUserDetails {

    protected UserDetails usrDetail;

    /**
     * Gets the value of the usrDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetails }
     *     
     */
    public UserDetails getUsrDetail() {
        return usrDetail;
    }

    /**
     * Sets the value of the usrDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetails }
     *     
     */
    public void setUsrDetail(UserDetails value) {
        this.usrDetail = value;
    }

}
