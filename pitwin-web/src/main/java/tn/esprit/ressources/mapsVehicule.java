package tn.esprit.ressources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.transport.ServiceVehiculeLocal;

@Path("/mapsVehicule")
public class mapsVehicule {

	@Inject
	ServiceVehiculeLocal myejb;

	@GET
	@Produces("application/json")
	@Path("/bus")
	public Response getALLAdresseOfBus() {
		List<String> list = myejb.getALLAdresseOfBus();

		if (list == null)
			return Response.status(Status.NOT_FOUND).entity("Adress not found").build();
		else {
			return Response.ok(list).build();
		}
	}

	@GET
	@Produces("application/json")
	@Path("/train")
	public Response getALLAdresseOfTrain() {
		List<String> list = myejb.getALLAdresseOfTrain();
		if (list == null)
			return Response.status(Status.NOT_FOUND).entity("Adress not found").build();
		else {
			return Response.ok(list).build();
		}

	}

	@GET
	@Produces("application/json")
	@Path("/metro")
	public Response getALLAdresseOfMero() {

		List<String> list = myejb.getALLAdresseOfMetro();
		if (list == null)
			return Response.status(Status.NOT_FOUND).entity("Adress not found").build();
		else {
			return Response.ok(list).build();
		}

	}
}