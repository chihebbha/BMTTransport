package tn.esprit.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator extends Person implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}
   
}
