package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Taxi
 *
 */
@Entity

public class Taxi implements Serializable {

	   
	
	private Integer id_Taxi;
	private String matricule_Taxi;
	private static final long serialVersionUID = 1L;

	public Taxi() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Taxi() {
		return this.id_Taxi;
	}

	public void setId_Taxi(Integer id_Taxi) {
		this.id_Taxi = id_Taxi;
	}   
	public String getMatricule_Taxi() {
		return this.matricule_Taxi;
	}

	public void setMatricule_Taxi(String matricule_Taxi) {
		this.matricule_Taxi = matricule_Taxi;
	}
   
}
