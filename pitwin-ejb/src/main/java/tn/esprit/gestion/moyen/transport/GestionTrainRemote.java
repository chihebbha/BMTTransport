package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.persistance.Train;
import tn.esprit.persistance.Vehicle;

@Remote
public interface GestionTrainRemote {

	
	String  addTrain(Train train);
	boolean updateVehicle(Train train);
	boolean deleteVehicle(Train train);
	Vehicle findTrain(Integer idTrain);
	List<Train> findAllTrains();	
	
	
}
