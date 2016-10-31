package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Itinerary
 *
 */
@Entity

public class Itinerary implements Serializable {

	   
	
	private Integer id_Itinerary;
	private String ligne_Itinerary;
	private String arret_Itinerary;
	private Integer ordre_Itinerary;
	
	
	
	private static final long serialVersionUID = 1L;
	

	

	public Itinerary() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Itinerary() {
		return this.id_Itinerary;
	}

	public void setId_Itinerary(Integer id_Itinerary) {
		this.id_Itinerary = id_Itinerary;
	}   
	public String getLigne_Itinerary() {
		return this.ligne_Itinerary;
	}

	public void setLigne_Itinerary(String ligne_Itinerary) {
		this.ligne_Itinerary = ligne_Itinerary;
	}   
	public String getArret_Itinerary() {
		return this.arret_Itinerary;
	}

	public void setArret_Itinerary(String arret_Itinerary) {
		this.arret_Itinerary = arret_Itinerary;
	}   
	public Integer getOrdre_Itinerary() {
		return this.ordre_Itinerary;
	}

	public void setOrdre_Itinerary(Integer ordre_Itinerary) {
		this.ordre_Itinerary = ordre_Itinerary;
	}
   
}
