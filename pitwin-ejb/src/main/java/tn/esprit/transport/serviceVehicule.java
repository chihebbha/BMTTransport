package tn.esprit.transport;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Metro;
import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;
import tn.esprit.persistance.Train;

@Stateless 

public class serviceVehicule implements ServiceVehiculeLocal  {
	@PersistenceContext 
	private EntityManager em;
	
	public serviceVehicule () {}
	

	
	

	@Override
	public List<String> getALLAdresseOfBus() {
	List<Planning>plannings = em.createQuery("select p from  Planning p  group by p.vehicle  ")
				.getResultList();
		List<String>addres = new ArrayList<String>();
		for (Planning planning : plannings) {
			if (planning.getVehicle() instanceof Bus )
			{
			addres.add(planning.getItinerary().getArret_Itinerary());
			}
		
		}
		return addres;
	}

	@Override
	public List<String> getALLAdresseOfTrain() {
		List<Planning>plannings = em.createQuery("select p from  Planning p  group by p.vehicle  ")
				.getResultList();
		List<String>addres = new ArrayList<String>();
		for (Planning planning : plannings) {
			if (planning.getVehicle() instanceof Train )
			{
			addres.add(planning.getItinerary().getArret_Itinerary());
			}
		
		}
		return addres;
		
	}





	@Override
	public List<String> getALLAdresseOfMetro() {
		List<Planning>plannings = em.createQuery("select p from  Planning p  group by p.vehicle  ")
				.getResultList();
		List<String>addres = new ArrayList<String>();
		for (Planning planning : plannings) {
			if (planning.getVehicle() instanceof Metro )
			{
			addres.add(planning.getItinerary().getArret_Itinerary());
			}
		
		}
		return addres;
		
	
	
	}


	
	



	

}
