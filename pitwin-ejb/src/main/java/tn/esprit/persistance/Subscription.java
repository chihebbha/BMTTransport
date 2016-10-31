package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subscription
 *
 */
@Entity

public class Subscription implements Serializable {

	   
	
	private Integer id_Subscripton;
	private Date date_Subscripton;
	private String numCarte_Subscripton;
	private Customer customer;
	private Administrator administrator;
	private static final long serialVersionUID = 1L;

	public Subscription() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Subscripton() {
		return this.id_Subscripton;
	}

	public void setId_Subscripton(Integer id_Subscripton) {
		this.id_Subscripton = id_Subscripton;
	}   
	public Date getDate_Subscripton() {
		return this.date_Subscripton;
	}

	public void setDate_Subscripton(Date date_Subscripton) {
		this.date_Subscripton = date_Subscripton;
	}   
	public String getNumCarte_Subscripton() {
		return this.numCarte_Subscripton;
	}

	public void setNumCarte_Subscripton(String numCarte_Subscripton) {
		this.numCarte_Subscripton = numCarte_Subscripton;
	}
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@ManyToOne
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
   
}
