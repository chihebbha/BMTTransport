package tn.esprit.ressources;

import java.awt.PageAttributes.MediaType;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.Application;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;




import javax.ws.rs.core.Response;

import tn.esprit.gestion.moyen.transport.GestionBusLocal;
import tn.esprit.gestion.moyen.transport.GestionMoyenTransport;
import tn.esprit.gestion.moyen.transport.GestionMoyenTransportLocal;
import tn.esprit.gestion.moyen.transport.GestionTrainLocal;
import tn.esprit.gestion.moyen.transport.GestionTrainRemote;
import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Train;
import tn.esprit.persistance.Vehicle;
import tn.esprit.gestion.moyen.transport.Metro;

@Path("/vehicles")

public class VehicleRessource  extends javax.ws.rs.core.Application  {

	@Inject
	GestionMoyenTransportLocal myejb;
	
	
	
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response getDep(){
		
		return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.findAllVehicle()).build();
	}
	
	
	
	@Path("/Train")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response getTrain(){
		
		return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.findAllTrain()).build();
	}
	
	
	@Path("/Bus")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response getBus(){
		
		return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.findAllBus()).build();
	}
	
	@Path("/Metro")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response getMetro(){
		
		return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.findAllMetro()).build();
	}
	
	
	@GET
	@Path("/{idVehicle}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("idVehicle") int idVehicle){

		return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.findVehicle(idVehicle)).build();
		
		//return myejb.findVehicle(id);
	}
	
	
//	
//	@GET
//	@Produces("application/json")
//	@Path("/query")
//	public Vehicle findVehiculeByMatriVehicle(@QueryParam("matricule")String matricule_vehicule){
//		return myejb.findVehicleByMatricule(matricule_vehicule);
//	}
//	
//	
//	
//	@GET
//	@Produces("application/json")
//	@Path("/query")
//	public Vehicle findVehiculeByTarif(@QueryParam("tarif_matricule")String tarif_vehicule){
//		return myejb.findVehicleByMatricule(tarif_vehicule);
//	}
	

	@DELETE
	@Path("/delete/{id}")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public boolean deleteVehicle(@PathParam("id") Integer id){
		Vehicle v=myejb.findVehicle(id);
		
		return myejb.deleteVehicle(v);
		
	}
	
	
	@POST
	//@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes("application/json") 
	public Response addVehicle ( Vehicle vehicle) {
		 
	System.out.println("alaaa");
	return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.addVehcile(vehicle)).build();

	}
	
	
	
	@POST
	@Path("/Bus")
	//@Produces("plain/Text")
	@Consumes("application/json") 
	public Response addBus(Bus bus) {
		 
	
	return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.AddBus(bus)).build();
			
	}
	
	@POST
	@Path("/Train")
	//@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes("application/json") 
	public Response addTrain( Train train) {
		 
	
	return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.AddTrain(train)).build();
			
	}
	
	
	@POST
	@Path("/Metro")
	//@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes("application/json") 
	public Response addMetro(Metro metro) {
		 
	
	return Response.status(javax.ws.rs.core.Response.Status.OK).entity(myejb.AddMetro(metro)).build();
			
	}
}
