package spring.tutorial.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-06-28T20:08:09.689-03:00
 * Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://webservice.tutorial.spring/", name = "IBankAccountService")
@XmlSeeAlso({ObjectFactory.class})
public interface IBankAccountService {

    @WebMethod
    @RequestWrapper(localName = "addUserDetails", targetNamespace = "http://webservice.tutorial.spring/", className = "spring.tutorial.webservice.AddUserDetails")
    @ResponseWrapper(localName = "addUserDetailsResponse", targetNamespace = "http://webservice.tutorial.spring/", className = "spring.tutorial.webservice.AddUserDetailsResponse")
    public void addUserDetails(
        @WebParam(name = "usrDetail", targetNamespace = "")
        spring.tutorial.webservice.UserDetails usrDetail
    );

    @WebMethod
    @RequestWrapper(localName = "getUserDetails", targetNamespace = "http://webservice.tutorial.spring/", className = "spring.tutorial.webservice.GetUserDetails")
    @ResponseWrapper(localName = "getUserDetailsResponse", targetNamespace = "http://webservice.tutorial.spring/", className = "spring.tutorial.webservice.GetUserDetailsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public spring.tutorial.webservice.UserDetails getUserDetails(
        @WebParam(name = "userName", targetNamespace = "")
        java.lang.String userName
    );
}
