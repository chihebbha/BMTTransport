package tn.esprit.ressources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reclamation;
import tn.esprit.transport.ReclamationServiceLocal;
import tn.esprit.transport.ReclamationServiceRemote;

@Path("/reclamations")

public class ReclamationRessource {
	
	@Inject
	ReclamationServiceLocal myejb;//local
	
	
	
	@GET
	@Produces("application/json")
	public Response getReclamation(){
		
		return Response.status(Status.OK).entity(myejb.viewReclamation()).build();

	}
	
	
	
	@GET
	@Produces("application/json")
	@Path("/{id}")
	public Reclamation findById(@PathParam("id")Integer id){

		return myejb.findReclamationById(id);
	}
	
 @DELETE
 @Path("/{id_Reclamation}")
	public Response delete(@PathParam("id_Reclamation") int id_Reclamation){
	 return Response.status(Status.OK).entity(myejb.delete(id_Reclamation)).build();
	 }
	
 
	@POST
	@Path("ajoutRc")
	@Consumes("application/json")
	public Response addSubscription(Reclamation reclamation) {

		return Response.status(Status.OK).entity(myejb.AddReclamation(reclamation)).build();
		
	}

}
