package tn.esprit.ressources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import tn.esprit.gestion.moyen.transport.GestionBusLocal;
import tn.esprit.gestion.moyen.transport.GestionMoyenTransportLocal;

@Path("/bus")

public class BusRessource {

	@Inject
	GestionBusLocal myejb;
	
	@GET
	@Produces("application/json")
	public Response getBus(){
		
		return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.findAllBus()).build();
	}
}
