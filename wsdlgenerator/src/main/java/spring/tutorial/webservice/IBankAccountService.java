package spring.tutorial.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

import spring.tutorial.domain.UserDetails;

@WebService
public interface IBankAccountService {
	
	public UserDetails getUserDetails (@WebParam(name="userName") final String username);
	
	public void addUserDetails(@WebParam(name="usrDetail") final UserDetails details);

}
