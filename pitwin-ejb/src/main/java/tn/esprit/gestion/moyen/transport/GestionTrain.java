package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.persistance.Train;
import tn.esprit.persistance.Vehicle;

/**
 * Session Bean implementation class GestionTrain
 */
@Stateless
@LocalBean
public class GestionTrain implements GestionTrainRemote, GestionTrainLocal {

	 @PersistenceContext
	    EntityManager entityManager;
	 
    public GestionTrain() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public boolean updateVehicle(Train train) {
		try
		{
			entityManager.merge(train);
			return true;
		} catch(Exception e){	
			return false;
		}
	}

	@Override
	public boolean deleteVehicle(Train train) {
		try
		{
			entityManager.remove(entityManager.merge(train));
			return true;
		} catch(Exception e){	
			return false;
		}
	}

	@Override
	public Vehicle findTrain(Integer idTrain) {
		Train train=null;
		try
		{
			train=entityManager.find(Train.class, idTrain);
			//return true;
		} catch(Exception e){	
//			return false;
		}
		return train;
	}

	@Override
	public List<Train> findAllTrains() {
		return entityManager.createQuery("select t from Train t", Train.class)
		.getResultList();
	}


	@Override
	public String addTrain(Train train) {
		// TODO Auto-generated method stub
		return null;
	}

}
