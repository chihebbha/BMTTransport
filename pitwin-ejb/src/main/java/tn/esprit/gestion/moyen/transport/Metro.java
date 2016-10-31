package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 * Session Bean implementation class Metro
 */
@Stateless
@LocalBean
public class Metro implements  MetroLocal {

	@PersistenceContext
	    EntityManager entityManager;
	 
	 
    public Metro() {
        // TODO Auto-generated constructor stub
    }

		
	

	@Override
	public boolean updateMetro(Metro metro) {
		try
		{
			entityManager.merge(metro);
			return true;
		} catch(Exception e){	
			return false;
		}
		
	}

	@Override
	public boolean deleteMetro(Metro metro) {
		try
		{
			entityManager.remove(entityManager.merge(metro));
			return true;
		} catch(Exception e){	
			return false;
		}
	}

	@Override
	public Metro findMetro(Integer idMetro) {
		Metro metro=null;
		try
		{
		metro=entityManager.find(Metro.class, idMetro);
			//return true;
		} catch(Exception e){	
//			return false;
		}
		return metro;
	}

	@Override
	public List<Metro> findAllMetro() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public String addMetro(Metro metro) {
		// TODO Auto-generated method stub
		return null;
	}

}
