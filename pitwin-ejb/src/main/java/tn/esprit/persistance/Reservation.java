package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {

	   
	
	private Integer id_Reservation;
	private Date date_Reservation;
	private double prix_Reservation;
	private Itinerary itinerary;
	private	Customer customer;
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Reservation() {
		return this.id_Reservation;
	}

	public void setId_Reservation(Integer id_Reservation) {
		this.id_Reservation = id_Reservation;
	}   
	public Date getDate_Reservation() {
		return this.date_Reservation;
	}

	public void setDate_Reservation(Date date_Reservation) {
		this.date_Reservation = date_Reservation;
	}   
	public double getPrix_Reservation() {
		return this.prix_Reservation;
	}

	public void setPrix_Reservation(double prix_Reservation) {
		this.prix_Reservation = prix_Reservation;
	}
	@ManyToOne
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString()
	{
		return id_Reservation+" "+prix_Reservation+" ";
	}
   
}
