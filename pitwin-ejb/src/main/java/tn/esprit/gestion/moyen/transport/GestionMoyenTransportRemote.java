package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Vehicle;

@Remote
public interface GestionMoyenTransportRemote {

	String AddBus(Bus bus);

	
}
