package tn.esprit.gestion.moyen.transport;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tn.esprit.persistance.Bus;
import tn.esprit.persistance.Train;
import tn.esprit.persistance.Vehicle;

/**
 * Session Bean implementation class GestionMoyenTransport
 */
@Stateless
public class GestionMoyenTransport implements GestionMoyenTransportRemote, GestionMoyenTransportLocal, Serializable {

   @PersistenceContext
    EntityManager entityManager;
    
    
   
    
    public GestionMoyenTransport() {
    
    }

    
	@Override
	public String addVehcile(Vehicle vehicle) {
		entityManager.persist(vehicle);
		return "ajoutééé";
	
	}
	
	
	@Override
	public boolean updateVehicle(Vehicle vehicle) {
		try
		{
			entityManager.merge(vehicle);
			return true;
		} catch(Exception e){	
			return false;
		}
	}

	@Override
	public boolean deleteVehicle(Vehicle vehicle) {
		try
		{
			entityManager.remove(entityManager.merge(vehicle));
			return true;
		} catch(Exception e){	
			return false;
		}
	}

	@Override
	public Vehicle findVehicle(Integer idVehicle) {
			//Vehicle vehicle=null;
		
		String req="select v from Vehicle v where v.id_Vehicle=:idVehicle";
		Query q=entityManager.createQuery(req);
		q.setParameter("idVehicle", idVehicle);
		return (Vehicle)q.getSingleResult();
	}

	@Override
	public List<Vehicle> findAllVehicle() {
		
return entityManager.createQuery("select v from Vehicle v", Vehicle.class)
		.getResultList();
		
		
//		String jpql ="select v from Vehicle v";
//		TypedQuery<Vehicle> query = entityManager.createQuery(jpql, Vehicle.class);
//		List<Vehicle> allViVehicles = query.getResultList();
//		return allViVehicles;
		
	}

	@Override
	public Vehicle findVehicleByMatricule(String matricule_vehicule) {
		Vehicle vehicle=null;
		try
		{
			vehicle=entityManager.find(Vehicle.class, matricule_vehicule);
			//return true;
		} catch(Exception e){	
//			return false;
		}
		return vehicle;
	}

	@Override
	public Vehicle findVehicleByTarif(Double tarif_vehicule) {
		Vehicle vehicle=null;
		try
		{
			vehicle=entityManager.find(Vehicle.class, tarif_vehicule);
			//return true;
		} catch(Exception e){	
//			return false;
		}
		return vehicle;
	}


	@Override
	public List<Vehicle> findAllTrain() {
		return entityManager.createQuery("select v from Train v", Vehicle.class)
				.getResultList();
	}


	@Override
	public List<Vehicle> findAllMetro() {
		return entityManager.createQuery("select v from Metro v", Vehicle.class)
				.getResultList();
	}


	@Override
	public List<Vehicle> findAllBus() {
		return entityManager.createQuery("select v from Bus v", Vehicle.class)
				.getResultList();}

	//@Override
//	public List<Vehicle> findAllVehicle() {
////		Query query = entityManager.createQuery("select e from vehicle e");
////		
////		
//
//		
//	}

	@Override
	  public String AddBus(Bus bus) {
			
				entityManager.persist(bus);
				return "true";
		
			
		}
	  
	  
	  
	  

		@Override
		public String AddTrain(Train train) {
			
				entityManager.persist(train);
				return "true";
			
			
		}
	
		

	    @Override
		public String AddMetro(Metro metro) {
			
				entityManager.persist(metro);
				return "true";
			
			
		}
		
}
