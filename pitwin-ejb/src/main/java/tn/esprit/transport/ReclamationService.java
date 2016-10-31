package tn.esprit.transport;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reclamation;

@Stateless
public class ReclamationService implements ReclamationServiceRemote,
		ReclamationServiceLocal {
	@PersistenceContext
	private EntityManager em;

	public ReclamationService() {
	}

	@Override
	public String AddReclamation(Reclamation reclamation) {
		em.persist(reclamation);
		return "Ajout avec succes";
	}

	
	
	

	@Override
	public List<Reclamation> viewReclamation() {
		return em.createQuery("select s from Reclamation s", Reclamation.class)
				.getResultList();
	}

	@Override
	public void update(Reclamation reclamation) {

		em.merge(reclamation);

	}



	@Override
	public Reclamation findReclamationById(Integer id) {
		return em.find(Reclamation.class, id);
	}

	@Override
	public String delete(int id_Reclamation) {
		Reclamation r=findReclamationById(id_Reclamation);
		em.remove(em.merge(r));
		return null;
	}

}
