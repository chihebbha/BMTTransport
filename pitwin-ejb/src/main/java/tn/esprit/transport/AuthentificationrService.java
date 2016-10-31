package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Stateless 

public class AuthentificationrService implements AuthentificationLocal{
	@PersistenceContext
	
	private EntityManager em;

	@Override
	public Customer connecter(String login, String password) {
		
		Query query = em.createQuery("select d from Customer d where d.login_Person =:x and d.password_Person =:y");
		
		query.setParameter("x", login);
		query.setParameter("y", password);
		return (Customer) query.getSingleResult();
	
				
		
			
		}
	}
	
	

	



	


