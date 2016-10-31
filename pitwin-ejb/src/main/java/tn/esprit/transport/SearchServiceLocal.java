package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Local
public interface SearchServiceLocal {
	List<Planning> findAll();
	List<Planning> filterByDate(Date dateDepart);
	List<Planning> filterOrdered(int userIdÒ);
	List<Planning> filterByLine(Line line);
	//List<Planning> filterByArrival(String Arrival);
	List<Planning> filterByIdVehicule(Integer idIm);
	List<Reservation> filterReservationByDateReservation(Date datedate_Reservation);
	List<Reservation> filterReservationByIdCustomer(Integer id);
	
}
