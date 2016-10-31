package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Stateless // sans etat:: ne garde pas les donnees

public class SearchService implements SearchServiceRemote, SearchServiceLocal {
	@PersistenceContext // recupperer modofier
	
	private EntityManager em;
	// qui permet de faire la conn ac la bas
	
	@Override
	public List<Planning> findAll() {
		return em.createQuery("select d from Planning d", Planning.class).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override //pr limplméntation des membres de l'interface
	public List<Planning> filterByDate(Date dateDepart) {
		return em.createQuery("select d from Planning d where d.dateDepart=:param").setParameter("param", dateDepart)
				.getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Planning> filterOrdered(int userIdÒ) {

		return em.createQuery("select d from Planning d where d.itinerary.ordre_Itinerary=:param")
				.setParameter("param", userIdÒ).getResultList();
	}


	
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Planning> filterByIdVehicule(Integer idIm) {
		return em.createQuery("select d from Planning d where d.vehicle.id_Vehicle=:param")
				.setParameter("param", idIm).getResultList();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> filterReservationByIdCustomer(Integer id) {

		return em.createQuery("select d from Reservation d where d.customer.id_Person=:param").setParameter("param", id)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> filterReservationByDateReservation(Date datedate_Reservation) {
		return em.createQuery("select d from Reservation d where d.datedate_Reservation=:param")
				.setParameter("param", datedate_Reservation).getResultList();

	}

	/*

	@SuppressWarnings("unchecked")
	@Override
	public List<Planning>filterByIdIternery(Integer IDI) {
		return em.createQuery("select d from Planning d where d.itinerary.id_Itinerary=:param")
				.setParameter("param", IDI).getResultList();
	}
	*/

	@Override
	public List<Planning> filterByLine(Line line) {
		// TODO Auto-generated method stub
		return null;
	}

	



	

}
