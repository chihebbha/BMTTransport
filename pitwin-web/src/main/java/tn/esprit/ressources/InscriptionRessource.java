package tn.esprit.ressources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.business.InscriptionServiceLocal;
import tn.esprit.business.InscriptionServiceRemote;
import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;

@Path("/subscriptions")
public class InscriptionRessource {

	@Inject
	InscriptionServiceLocal myejb;
	
	
	@GET
	@Produces("application/json")
	@Path("subs/{id}")
	public Response find(@PathParam("id")Integer id){
		
		return Response.status(Status.OK).entity(myejb.find(id)).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("mail/{from}/{password}/{Subject}/{message}/{to}/{attachFiles}")
	public Response SendMail(@PathParam("from")String from, @PathParam("password")String password, @PathParam("Subject")String Subject,
			@PathParam("message")String message, @PathParam("to")String[] to, @PathParam("attachFiles")String[] attachFiles){
		
		return Response.status(Status.OK).entity(myejb.SendMail(from, password, Subject, message, to, null)).build();
	}
	
}
