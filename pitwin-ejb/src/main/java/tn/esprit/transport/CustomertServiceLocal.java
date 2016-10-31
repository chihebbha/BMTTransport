package tn.esprit.transport;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;

@Local
public interface CustomertServiceLocal {
	String AddCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	void delete(Integer id);
	List<Customer> findByStatusService(String statusService);
	List<Customer> findAll();
	List<Customer> findAllNewRequests();
	void validateCustomerService(Customer c);
	void rejectCustomerService(Customer c);
	Customer getCustemeById (Integer id ); 

}
