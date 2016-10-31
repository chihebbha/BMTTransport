package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Vehicle;

@Local
public interface GestionBusLocal {

	
	String  addBus(Bus bus);
	boolean updateBus(Bus bus);
	boolean deleteBus(Bus bus);
	Bus findBus(Integer idBus);
	List<Bus> findAllBus();	
	
	
}
