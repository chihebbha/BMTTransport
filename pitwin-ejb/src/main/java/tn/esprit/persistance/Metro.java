package tn.esprit.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Metro
 *
 */
@Entity

public class Metro extends Vehicle implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Metro() {
		super();
	}
   
}
