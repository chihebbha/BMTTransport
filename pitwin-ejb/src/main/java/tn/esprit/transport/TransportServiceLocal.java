package tn.esprit.transport;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Itinerary;
import tn.esprit.persistance.Planning;

@Local
public interface TransportServiceLocal {
	public boolean addTransportInformation(Planning p) ;
	public boolean addItinerary(Itinerary it) ;
	public List<Planning> findAllPlanning() ;
	public Planning findPlanningById(Integer id) ;
	public Itinerary findItineraryById(Integer id) ;
	public List<Itinerary> findItinerary();
	public List<Customer> listAllCustomer();
		
	
}
