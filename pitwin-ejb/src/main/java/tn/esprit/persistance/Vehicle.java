package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicle
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Vehicle implements Serializable {

	   
	
	private Integer id_Vehicle;
	private String matricule_Vehicle;
	private double tarif_Vehicle;
    
	
    private static final long serialVersionUID = 1L;
	
	

	public Vehicle() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Vehicle() {
		return this.id_Vehicle;
	}

	public void setId_Vehicle(Integer id_Vehicle) {
		this.id_Vehicle = id_Vehicle;
	}   
	public String getMatricule_Vehicle() {
		return this.matricule_Vehicle;
	}

	public void setMatricule_Vehicle(String matricule_Vehicle) {
		this.matricule_Vehicle = matricule_Vehicle;
	}   
	public double getTarif_Vehicle() {
		return this.tarif_Vehicle;
	}

	public void setTarif_Vehicle(double tarif_Vehicle) {
		this.tarif_Vehicle = tarif_Vehicle;
	}
   
}
