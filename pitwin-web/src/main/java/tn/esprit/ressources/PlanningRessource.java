package tn.esprit.ressources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;




import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.persistance.Planning;
import tn.esprit.transport.PlanningServiceLocal;
import tn.esprit.transport.PlanningServiceRemote;

@Path("/plannings")

public class PlanningRessource {

	@Inject
	PlanningServiceLocal myejb;
	
	@GET
	@Produces("application/json")
	public Response getPlanning(){
		
		return Response.status(Status.OK).entity(myejb.viewPlanning()).build();

	}
	
	
	
	@POST
	@Path("ajoutPl")
	@Consumes("application/json")
	public Response addSubscription(Planning planning) {

		return Response.status(Status.OK).entity(myejb.AddPlanning(planning)).build();
		
	}
	
	
	
	
}
	
	
	
	


