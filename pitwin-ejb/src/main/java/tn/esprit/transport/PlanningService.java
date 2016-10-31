package tn.esprit.transport;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.persistance.Planning;




@Stateless
@LocalBean
public class PlanningService implements PlanningServiceRemote, PlanningServiceLocal {

	@PersistenceContext
	private EntityManager em;
	
    public PlanningService() {
        
    	
    }

	@Override
	public List<Planning> viewPlanning() {
		return em
				.createQuery("select s from Planning s", Planning.class)
				.getResultList();
	}


	@Override
	public String AddPlanning(Planning planning) {
		em.persist(planning);
		return "Ajout avec succes";
	}

	

	
}
