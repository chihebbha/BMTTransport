package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bus
 *
 */
@Entity

public class Bus extends Vehicle implements Serializable {

	
	private String type_Bus;
	private static final long serialVersionUID = 1L;

	public Bus() {
		super();
	}   
	public String getType_Bus() {
		return this.type_Bus;
	}

	public void setType_Bus(String type_Bus) {
		this.type_Bus = type_Bus;
	}
   
}
