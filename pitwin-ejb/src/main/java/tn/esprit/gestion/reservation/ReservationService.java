package tn.esprit.gestion.reservation;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import tn.esprit.persistance.Reservation;

/**
 * Session Bean implementation class ReservationService
 */
@Stateless


public class ReservationService implements ReservationServiceRemote, ReservationServiceLocal {

	@PersistenceContext
	   private EntityManager em;
	
	
    public ReservationService() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public boolean AddReservation( Reservation r) {

	if(r!=null)
		{em.persist(r);
		return true;}
	else
		return false;

	}


	


	@Override
	public List<Reservation> listAllReservation() {
		
	String	req="select r from Reservation r";
	//	return l;
		
		return em.createQuery(req,Reservation.class).getResultList();
	}


	

	@Override
	public boolean deleteReservation( Reservation r) {
		em.remove(em.merge(r));
		return true;


	}



	@Override
	public Reservation findReservationbyid( Integer id) {
return em.find(Reservation.class, id);
	}


	@Override
	public List<Reservation> findReservationbyPrix(double min, double max) {

	String req="select r from Reservation r where r.prix_Reservation>:min AND r.prix_Reservation<:max ";
	Query query=em.createQuery(req,Reservation.class);
	query.setParameter("min", min);
	query.setParameter("max", max);
	return query.getResultList();

	}

}
