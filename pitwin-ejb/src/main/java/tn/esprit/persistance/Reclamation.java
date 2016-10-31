package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reclamation
 *
 */
@Entity

public class Reclamation implements Serializable {

	   
	
	private Integer id_Reclamation;
	private Date dateRec_Reclamation;
	private String sujet_Reclamation;
	private String message_Reclamation;
	private Customer cutomer;
	private static final long serialVersionUID = 1L;

	public Reclamation() {
		super();
	}   
	public Reclamation(Integer id_Reclamation,Date dateRec_Reclamation,String sujet_Reclamation,String message_Reclamation,Customer cutomer) {
		super();
		this.id_Reclamation=id_Reclamation;
		this.dateRec_Reclamation=dateRec_Reclamation;
		this.sujet_Reclamation=sujet_Reclamation;
		this.message_Reclamation=message_Reclamation;
		this.cutomer=cutomer;
	}  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Reclamation() {
		return this.id_Reclamation;
	}

	public void setId_Reclamation(Integer id_Reclamation) {
		this.id_Reclamation = id_Reclamation;
	}   
	public Date getDateRec_Reclamation() {
		return this.dateRec_Reclamation;
	}

	public void setDateRec_Reclamation(Date dateRec_Reclamation) {
		this.dateRec_Reclamation = dateRec_Reclamation;
	}   
	public String getSujet_Reclamation() {
		return this.sujet_Reclamation;
	}

	public void setSujet_Reclamation(String sujet_Reclamation) {
		this.sujet_Reclamation = sujet_Reclamation;
	}   
	public String getMessage_Reclamation() {
		return this.message_Reclamation;
	}

	public void setMessage_Reclamation(String message_Reclamation) {
		this.message_Reclamation = message_Reclamation;
	}
	
	@ManyToOne
	public Customer getCustomer(){
		return cutomer;
	}
	
	public void setCustomer(Customer customer){
		this.cutomer = customer;
	}
   
	@Override
	public String toString()
	{return "id_Reclamation = "+id_Reclamation+" Date_reclamation = "+dateRec_Reclamation;
		
	}
	
}
