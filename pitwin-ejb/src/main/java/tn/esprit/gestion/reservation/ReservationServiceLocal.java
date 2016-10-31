package tn.esprit.gestion.reservation;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.*;

@Local
public interface ReservationServiceLocal {
	public boolean  AddReservation(Reservation r) ;
	public List<Reservation> listAllReservation() ;
	public boolean deleteReservation(Reservation r) ;
	public Reservation findReservationbyid(Integer id) ;
	public List<Reservation> findReservationbyPrix(double min,double max) ;		
}
