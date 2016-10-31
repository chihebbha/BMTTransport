package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Train;
import tn.esprit.persistance.Vehicle;

@Local
public interface GestionMoyenTransportLocal   {

	String  addVehcile(Vehicle vehicle);
	boolean updateVehicle(Vehicle vehicle);
	boolean deleteVehicle(Vehicle vehicle);
	Vehicle findVehicle(Integer idVehicle);
	Vehicle findVehicleByMatricule(String matricule_vehicule);
	Vehicle findVehicleByTarif(Double tarif_vehicule);

	List<Vehicle> findAllVehicle();	
	List<Vehicle> findAllTrain();	
	List<Vehicle> findAllMetro();	
	List<Vehicle> findAllBus();	
	
	 String AddBus(Bus bus);
	 String AddTrain(Train train) ;
	String AddMetro(Metro metro);
}
