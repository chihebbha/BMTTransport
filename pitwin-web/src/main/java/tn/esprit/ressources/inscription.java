package tn.esprit.ressources;

import java.util.List;

import javax.faces.bean.CustomScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.transport.inscriptionLocal;



@Path("/inscription")
public class inscription {

	
	@Inject
	inscriptionLocal myejb;

	
	
	@POST
	@Consumes("application/json")
	@Path("/inscrit")
	public void inscription(Customer  customer){
		myejb.inscription(customer);
	}
	
	@GET
	@Produces("application/json")
	@Path("/{id}")
	public Customer find(@PathParam("id")Integer id){
		return myejb.find(id);
	}
	
	
	@GET
	@Produces("application/json")
	@Path("/custemer")
	public List<Customer>getALLCustomers(){
		
		return myejb.getALLCustomers();
		
	}
	
	/*@GET
	@Produces("application/json")
	@Path("/{from}/{password}/{Subject}/{message}/{to}/{attachFiles}")
	public boolean SendMail(@PathParam("from")String from, @PathParam("password")String password, @PathParam("Subject")String Subject,
			@PathParam("message")String message, @PathParam("to")String[] to, @PathParam("attachFiles")String[] attachFiles){
		return myejb.SendMail(from, password, Subject, message, to, attachFiles);
	}
	*/
	
	
	
	
}
