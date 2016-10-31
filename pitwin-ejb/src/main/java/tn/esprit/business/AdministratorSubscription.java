package tn.esprit.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;





import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Subscription;

/**
 * Session Bean implementation class AdministratorSubscription
 */
@Stateless
@LocalBean
public class AdministratorSubscription implements AdministratorSubscriptionRemote, AdministratorSubscriptionLocal {

	@PersistenceContext
	private EntityManager em;
	
    public AdministratorSubscription() {
        
    	
    }

	@Override
	public List<Subscription> viewSubscription() {
		return em
				.createQuery("select s from Subscription s", Subscription.class)
				.getResultList();
	}

	@Override
	public List<Subscription> view_subsc_expir_dates(int days) {
		return em.createQuery(
			    "select s from Subscription s "
			    + "where 365 - datediff(curdate(), s.date_Subscripton) < "+days, Subscription.class)
			    .getResultList() ;
	}

	@Override
	public String addSubscription(Subscription sub) {
		em.persist(sub);
		return "Ajout avec succes";
	}

	@Override
	public String inscriptionCustomer(Person customer) {
		em.persist(customer);
		return "Ajout avec succes";
	}

}
