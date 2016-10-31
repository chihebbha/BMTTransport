package tn.esprit.gestion.moyen.transport;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Bus;

@Local
public interface MetroLocal {

	
	String  addMetro(Metro metro);
	boolean updateMetro(Metro metro);
	boolean deleteMetro(Metro metro);
	Metro findMetro(Integer idMetro);
	List<Metro> findAllMetro();	
	
}
