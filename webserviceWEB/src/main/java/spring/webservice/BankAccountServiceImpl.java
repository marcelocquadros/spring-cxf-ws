package spring.webservice;

import java.math.BigDecimal;

import javax.jws.WebService;

import spring.tutorial.webservice.IBankAccountService;
import spring.tutorial.webservice.UserDetails;

@WebService(endpointInterface="spring.tutorial.webservice.IBankAccountService")

public class BankAccountServiceImpl implements IBankAccountService{

	@Override
	public void addUserDetails(UserDetails usrDetail) {
		System.out.println("User added");
		
	}

	@Override
	public UserDetails getUserDetails(String userName) {
		UserDetails userDetails = new UserDetails();
		userDetails.setBankBalance(new BigDecimal("94949.49"));
		userDetails.setName("Marcelo Quadros");
		return userDetails;
	}

}
