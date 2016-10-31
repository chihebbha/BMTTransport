package tn.esprit.business;

import javax.ejb.Local;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;

@Local
public interface InscriptionServiceLocal {

public void inscription(Person customer);
	
	public Customer find(Integer id);
	
	public void copie(String pathToCopy, String pathToPaste);
	
	public boolean SendMail(String from ,String password,String Subject ,String message,String to[],String[] attachFiles);
	
}
