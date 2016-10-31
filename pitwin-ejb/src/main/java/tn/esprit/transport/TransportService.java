package tn.esprit.transport;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Itinerary;
import tn.esprit.persistance.Planning;

/**
 * Session Bean implementation class TransportService
 */
@Stateless

public class TransportService implements TransportServiceRemote, TransportServiceLocal {

	@PersistenceContext
	   private EntityManager em;
	
    public TransportService() {
        // TODO Auto-generated constructor stub
    }
 
	@Override
	public boolean addTransportInformation( Planning p) {
		if(p==null){
 em.persist(p);		
 return true;}
		else
			return false;
	}
    
	
  
	@Override
	public boolean addItinerary( Itinerary it) {
if(it==null)
{
		em.persist(it);		
return true;}
else
	return false;
}
   
	@Override
	public List<Planning> findAllPlanning() {
String req="select r from Planning r";
		
		
		return em.createQuery(req,Planning.class).getResultList();		
	}

    

	@Override
	public Planning findPlanningById( Integer id) {
String req="select r from Planning r where r.id_Planning=:id";
		Query query=em.createQuery(req);
		 query.setParameter("id", id);
		 return (Planning) query.getSingleResult();
	}
	
   

	@Override
	public Itinerary findItineraryById( Integer id) {
		String req="select r from Itinerary r where r.id_Itinerary=:id";
		Query query=em.createQuery(req);
		 query.setParameter("id", id);
		 return (Itinerary) query.getSingleResult();
	}

	@Override
	public List<Itinerary> findItinerary() {
String req ="select i from Itinerary i";
Query query=em.createQuery(req);
return query.getResultList();


	}

	@Override
	public List<Customer> listAllCustomer() {
		String req ="select i from Customer i";
		Query query=em.createQuery(req);
		return query.getResultList();
		
	}
    
    

}
