package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actuality
 *
 */
@Entity

public class Actuality implements Serializable {

	   
	
	private Integer id_Actuality;
	private String etat_Actuality;
	private Vehicle vehicle;
	private static final long serialVersionUID = 1L;

	public Actuality() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Actuality() {
		return this.id_Actuality;
	}

	public void setId_Actuality(Integer id_Actuality) {
		this.id_Actuality = id_Actuality;
	}   
	public String getEtat_Actuality() {
		return this.etat_Actuality;
	}

	public void setEtat_Actuality(String etat_Actuality) {
		this.etat_Actuality = etat_Actuality;
	}

	@ManyToOne
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
   
}
