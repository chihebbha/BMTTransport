package tn.esprit.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Planning
 *
 */
@Entity

public class Planning implements Serializable {

	   
	
	private Integer id_Planning;
	private Date dateDepart_Planning;
	private Date dateArrivee_Planning;
	private Itinerary itinerary;
	private Vehicle vehicle;
	
	
	private static final long serialVersionUID = 1L;

	public Planning() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Planning() {
		return this.id_Planning;
	}

	public void setId_Planning(Integer id_Planning) {
		this.id_Planning = id_Planning;
	}   
	public Date getDateDepart_Planning() {
		return this.dateDepart_Planning;
	}

	public void setDateDepart_Planning(Date dateDepart_Planning) {
		this.dateDepart_Planning = dateDepart_Planning;
	}   
	public Date getDateArrivee_Planning() {
		return this.dateArrivee_Planning;
	}

	public void setDateArrivee_Planning(Date dateArrivee_Planning) {
		this.dateArrivee_Planning = dateArrivee_Planning;
	}
	@ManyToOne
	
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	@ManyToOne
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
   
}
