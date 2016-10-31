package tn.esprit.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Train
 *
 */
@Entity
public class Train extends Vehicle implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Train() {
		super();
	}
   
}
