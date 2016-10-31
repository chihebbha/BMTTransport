package tn.esprit.business;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Person;
import tn.esprit.persistance.Subscription;

@Local
public interface AdministratorSubscriptionLocal {

	public List<Subscription> viewSubscription();
	
	public List<Subscription> view_subsc_expir_dates(int days);
	
	
	public String addSubscription(Subscription sub);
	
	public String inscriptionCustomer(Person customer);
}
