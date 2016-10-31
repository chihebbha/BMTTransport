package tn.esprit.ressources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.gestion.reservation.ReservationServiceRemote;
import tn.esprit.persistance.Itinerary;
import tn.esprit.persistance.Planning;
import tn.esprit.transport.TransportServiceLocal;
import tn.esprit.transport.TransportServiceRemote;

@Path("/transport")
public class TransportRessource {
	 
	@Inject
	TransportServiceLocal myejb;
	
	  @POST
	   
	   @Consumes(MediaType.APPLICATION_JSON)
	   @Path(value="addTransp")
	    
	    public Response addTransportInf( Planning id_p)
	    {
	    	
	    	
	    	if(myejb.addTransportInformation(id_p))
				return Response.status(Status.CREATED).build();
			return Response.status(Status.NOT_FOUND).build();
	    }
	  
	
	    
	  @GET
	   @Produces(MediaType.APPLICATION_JSON)
	    public Response findAllPlanning() {
	    	
	    	
	    	return Response.status(Status.OK).entity( myejb.findAllPlanning()).build();
	    }
	  
	  @GET
	   @Produces(MediaType.APPLICATION_JSON)
	  @Path("customer")
	    public Response findAllCustomer() {
	    	
	    	
	    	return Response.status(Status.OK).entity( myejb.listAllCustomer()).build();
	    }
	 
	    
	   @POST	   
	   @Consumes(MediaType.APPLICATION_JSON)
	   @Path("addItin")
	  public Response addItiner( Itinerary it)
	    {
		   
		   if(myejb.addItinerary(it))
				return Response.status(Status.CREATED).build();
			return Response.status(Status.NOT_FOUND).build();
	    	 
	    	
	    }
	    
	    @GET
	    @Path("planning/{id}")	    
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response findPlanningById(@PathParam("id") Integer id){
	    	
	    	return Response.status(Status.OK).entity( myejb.findPlanningById(id)).build();
	    	
	    }
	    
	    @GET
	    @Path("itineraire/{id}")	   
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response findItineraryById(@PathParam("id") Integer id) {
	    	
	    	
	    	return Response.status(Status.OK).entity(myejb.findItineraryById(id)).build();
	    	 
	    }
	    
	    @GET
	    @Path("itineraire")	   
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response findItinerary() {
	    	
	    	
	    	return Response.status(Status.OK).entity(myejb.findItinerary()).build();
	    	 
	    }

}
