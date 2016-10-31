package tn.esprit.ressources;

import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.gestion.reservation.ReservationServiceLocal;
import tn.esprit.gestion.reservation.ReservationServiceRemote;
import tn.esprit.persistance.Reservation;


@Path("/reservation")
public class ReservationRessource  {

	@Inject
	ReservationServiceLocal myejb;
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response addReservations( Reservation r) {
		 
		
		if(myejb.AddReservation(r))
			return Response.status(Status.CREATED).build();
		return Response.status(Status.NOT_FOUND).build();
	}
	
	
	@GET
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public Response ListAllReservation()
	{
		
		return Response.status(Status.OK).entity(myejb.listAllReservation()).build();	
	}
	
	
	@DELETE
	@Path("/{id}")
	@javax.ws.rs.Produces(MediaType.TEXT_PLAIN)
	public boolean deleteReservation(@PathParam("id") Integer id){
		Reservation r=myejb.findReservationbyid(id);
		
		return myejb.deleteReservation(r);
		
	}
	
	
	@GET
	@Path("/{id}")
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	
	
	public Response findReservation(@PathParam("id") Integer id)
	{
		return Response.status(Status.OK).entity(myejb.findReservationbyid(id)).build();
		
	}
	
	
	@GET
	@Path("/{min}/{max}")
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	
	
	public Response findReservation(@PathParam("min") double min,@PathParam("max") double max)
	{
		return Response.status(Status.OK).entity(myejb.findReservationbyPrix(min, max)).build();
		
	}
	
	
}
