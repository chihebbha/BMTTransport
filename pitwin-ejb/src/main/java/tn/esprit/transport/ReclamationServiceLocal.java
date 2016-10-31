package tn.esprit.transport;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Reclamation;

@Local
public interface ReclamationServiceLocal {
	
	public String AddReclamation(Reclamation reclamtion);
	public List<Reclamation> viewReclamation();
	public void update(Reclamation reclamation);
	public String delete(int id_Reclamation);
	Reclamation findReclamationById(Integer id);


}