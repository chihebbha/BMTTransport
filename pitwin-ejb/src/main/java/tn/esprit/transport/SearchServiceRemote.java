package tn.esprit.transport;


import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Remote
public interface SearchServiceRemote {
	List<Planning> findAll();
	List<Planning> filterByDate(Date dateDepart);
	List<Planning> filterOrdered(int userIdÒ);
	List<Planning> filterByLine(Line line);
	//List<Planning> filterByArrival(Arrival Arrival);
	List<Planning> filterByIdVehicule(Integer idIm);
	List<Reservation> filterReservationByIdCustomer(Integer id);
	List<Reservation> filterReservationByDateReservation(Date datedate_Reservation);
	
}
