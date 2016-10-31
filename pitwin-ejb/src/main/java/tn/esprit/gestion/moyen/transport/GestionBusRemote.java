package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Vehicle;

@Remote
public interface GestionBusRemote {

	
	String  addBus(Bus bus);
	boolean updateBus(Bus bus);
	boolean deleteBus(Bus bus);
	Bus findBus(Integer idBus);
	List<Bus> findAllBus();	
	
}
