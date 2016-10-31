package tn.esprit.ressources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.transport.AuthentificationLocal;


@Path("/autentification")
public class autentification {

	
	@Inject
	AuthentificationLocal myejb;

	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/connect/{login}/{password}")
	public Response  connect(@PathParam("login") String login,@PathParam("password") String password) {
		Customer p= myejb.connecter(login, password);
		if (p == null)
			return Response.status(Status.NOT_FOUND).entity("Customer not found").build();
		else {
			return Response.ok(p).build();
		}
	}
	

		
	
	
	
}
