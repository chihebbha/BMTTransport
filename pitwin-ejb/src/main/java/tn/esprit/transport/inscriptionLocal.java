package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;
import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Local
public interface inscriptionLocal {
	
  void inscription(Customer customer);
  Customer find(Integer id) ;
  public List<Customer>getALLCustomers();
  void copie(String pathToCopy, String pathToPaste);
 /* boolean SendMail(String from, String password, String Subject,
			String message, String[] to, String[] attachFiles); */
  
}
