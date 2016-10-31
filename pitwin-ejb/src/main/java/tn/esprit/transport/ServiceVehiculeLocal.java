package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Local
public interface ServiceVehiculeLocal {
	List <String> getALLAdresseOfBus();
	List <String> getALLAdresseOfTrain();
	List <String> getALLAdresseOfMetro();
}
