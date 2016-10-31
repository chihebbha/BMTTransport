package tn.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Person implements Serializable {

	   
	
	private Integer id_Person;
	private String nom_Person;
	private String prenom_Person;
	private String cin_Person;
	private String adresse_Person;
	private String email_Person;
	private String telephone_Person;
	private Date dateNaissance_Person;
	private String login_Person;
	private String password_Person;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Person() {
		return this.id_Person;
	}

	public void setId_Person(Integer id_Person) {
		this.id_Person = id_Person;
	}   
	public String getNom_Person() {
		return this.nom_Person;
	}

	public void setNom_Person(String nom_Person) {
		this.nom_Person = nom_Person;
	}   
	public String getPrenom_Person() {
		return this.prenom_Person;
	}

	public void setPrenom_Person(String prenom_Person) {
		this.prenom_Person = prenom_Person;
	}   
	public String getCin_Person() {
		return this.cin_Person;
	}

	public void setCin_Person(String cin_Person) {
		this.cin_Person = cin_Person;
	}   
	public String getAdresse_Person() {
		return this.adresse_Person;
	}

	public void setAdresse_Person(String adresse_Person) {
		this.adresse_Person = adresse_Person;
	}   
	public String getEmail_Person() {
		return this.email_Person;
	}

	public void setEmail_Person(String email_Person) {
		this.email_Person = email_Person;
	}   
	public String getTelephone_Person() {
		return this.telephone_Person;
	}

	public void setTelephone_Person(String telephone_Person) {
		this.telephone_Person = telephone_Person;
	}   
	public Date getDateNaissance_Person() {
		return this.dateNaissance_Person;
	}

	public void setDateNaissance_Person(Date dateNaissance_Person) {
		this.dateNaissance_Person = dateNaissance_Person;
	}   
	public String getLogin_Person() {
		return this.login_Person;
	}

	public void setLogin_Person(String login_Person) {
		this.login_Person = login_Person;
	}   
	public String getPassword_Person() {
		return this.password_Person;
	}

	public void setPassword_Person(String password_Person) {
		this.password_Person = password_Person;
	}
   
}
