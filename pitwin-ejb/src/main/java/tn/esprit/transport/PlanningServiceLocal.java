package tn.esprit.transport;



import java.util.List;

import javax.ejb.Local;




import tn.esprit.persistance.Planning;

@Local
public interface PlanningServiceLocal {
	
	public String AddPlanning(Planning planning);
	public List<Planning> viewPlanning();
	
	

}
