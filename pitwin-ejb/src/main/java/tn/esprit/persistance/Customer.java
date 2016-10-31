package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends Person implements Serializable {

	
	private String service_Cutomer;
	private String statusService_Cutomer;
	private String imagePath_Customer;
	
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}
	
	
	
	public String getService_Cutomer() {
		return this.service_Cutomer;
	}

	public void setService_Cutomer(String service_Cutomer) {
		this.service_Cutomer = service_Cutomer;
	}   
	public String getStatusService_Cutomer() {
		return this.statusService_Cutomer;
	}

	public void setStatusService_Cutomer(String statusService_Cutomer) {
		this.statusService_Cutomer = statusService_Cutomer;
	}   
	public String getImagePath_Customer() {
		return this.imagePath_Customer;
	}

	public void setImagePath_Customer(String imagePath_Customer) {
		this.imagePath_Customer = imagePath_Customer;
	}



   
}
