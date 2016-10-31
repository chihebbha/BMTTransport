package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Local
public interface AuthentificationLocal {
	public Customer connecter(String login, String password);	
}
