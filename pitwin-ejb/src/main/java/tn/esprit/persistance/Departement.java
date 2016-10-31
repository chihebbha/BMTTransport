package tn.esprit.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Departement implements Serializable {
	
	/**
	 * 
	 */
	private int id;
	private String name;
	
	
	private static final long serialVersionUID = 1L;

	public Departement( ) {
		super();
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name + "]";
	}
	
	
}
