package br.com.marcelo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path(value="/prime")
public class ProbablyPrimeService {
	
	@GET
	@Path("/{number}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean isPrime(@PathParam("number") int n) {
		//check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
