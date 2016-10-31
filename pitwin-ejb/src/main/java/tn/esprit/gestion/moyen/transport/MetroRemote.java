package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface MetroRemote {

	
	String  addMetro(Metro metro);
	boolean updateMetro(Metro metro);
	boolean deleteMetro(Metro metro);
	Metro findMetro(Integer idMetro);
	List<Metro> findAllMetro();	
	
	
}
