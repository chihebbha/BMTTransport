/**
 * 
 */
/**
 * @author Cyrine
 *
 */
package tn.esprit.ressources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.persistance.Customer;

import tn.esprit.transport.CustomertServiceLocal;


@Path("/CustomerService")



public class CustomerService {
	
	@Inject
	CustomertServiceLocal myejb;
	
	
	@GET
	@Produces("application/json")
	public List<Customer> customers(){
		return myejb.findAll();
	}
//	
	/*@GET
	@Produces("application/json")
	@Path("/{id}")
	public Customer findById(@PathParam("id")int id){

		return (Customer) myejb.findAll();
	}
	*/
	
	@GET
	@Produces("application/json")
	@Path("/statusService")
	public Customer findBy(@QueryParam("statusService")String statusService){
		return (Customer) myejb.findByStatusService(statusService);
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String add(Customer customer){
		return myejb.AddCustomer(customer);
		
	}
	
	@GET
	@Produces("application/json")
	@Path("/get/{id}")
	public  Response  getCustomer(@PathParam("id") Integer id )
	{
		Customer p=myejb.getCustemeById(id); 
		
		if (p == null)
			return Response.status(Status.NOT_FOUND).entity("Customer not found").build();
		else {
			return Response.ok(p).build();
		}
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
