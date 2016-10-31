package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Train;
import tn.esprit.persistance.Vehicle;

/**
 * Session Bean implementation class GestionBus
 */
@Stateless
@LocalBean
public class GestionBus implements GestionBusRemote, GestionBusLocal {

	// @PersistenceContext(unitName="pitwinds")
	    EntityManager entityManager;
	 
    public GestionBus() {
        // TODO Auto-generated constructor stub
    }

  

	@Override
	public boolean updateBus(Bus bus) {

		try
		{
			entityManager.merge(bus);
			return true;
		} catch(Exception e){	
			return false;
		}
		
	}

	@Override
	public boolean deleteBus(Bus bus) {
		try
		{
			entityManager.remove(entityManager.merge(bus));
			return true;
		} catch(Exception e){	
			return false;
		}
	}

	@Override
	public Bus findBus(Integer idBus) {

		Bus bus=null;
		try
		{
		bus=entityManager.find(Bus.class, idBus);
			//return true;
		} catch(Exception e){	
//			return false;
		}
		return bus;
		
	}

	@Override
	public List<Bus> findAllBus() {
		// TODO Auto-generated method stub
	String req="select b from Bus ";
	return entityManager.createQuery(req,Bus.class).getResultList();
	
	}



	@Override
	public String addBus(Bus bus) {
		// TODO Auto-generated method stub
		return null;
	}

}
