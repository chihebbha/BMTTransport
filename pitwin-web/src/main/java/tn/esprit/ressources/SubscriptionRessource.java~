package tn.esprit.ressources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.business.AdministratorSubscriptionLocal;
import tn.esprit.business.AdministratorSubscriptionRemote;
import tn.esprit.persistance.Departement;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Subscription;

@Path("/subscrips")
public class SubscriptionRessource {

	@Inject
	AdministratorSubscriptionLocal myejb;
	
	@GET
	@Produces("application/json")
	public Response getSub(){
		
		return Response.status(Status.OK).entity(myejb.viewSubscription()).build();

	}
	
	@GET
	@Produces("application/json")
	@Path("expire/{days}")
	public Response getSubExpir(@PathParam("days")int days){

		return Response.status(Status.OK).entity(myejb.view_subsc_expir_dates(days)).build();
	}
	
	@POST
	@Path("ajoutSub")
	@Consumes("application/json")
	public Response addSubscription(Subscription sub) {

		return Response.status(Status.OK).entity(myejb.addSubscription(sub)).build();
		
	}
	
	@POST
	@Path("ajoutCus")
	@Consumes("application/json")
	public Response inscriptionCustomer(Person customer){

		return Response.status(Status.OK).entity(myejb.inscriptionCustomer(customer)).build();
	}
	
	
	
}
