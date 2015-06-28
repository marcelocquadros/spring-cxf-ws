package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.tutorial.webservice.IBankAccountService;
import spring.tutorial.webservice.UserDetails;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		System.out.println(context);
		IBankAccountService service =(IBankAccountService) context.getBean("bankServiceTestClient");
		System.out.println(service);
		UserDetails userDetails = service.getUserDetails("");
		System.out.println(userDetails.getName());
	}

}
