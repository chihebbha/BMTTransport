package tn.esprit.transport;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Person;

@Stateless

public class CustomerService implements  CustomertServiceLocal {
	@PersistenceContext
	private EntityManager em;

	public CustomerService() {
	}

	@Override
	public String AddCustomer(Customer customer) {
		em.persist(customer);
		return "Ajout avec succes";
	}

	@Override
	public void updateCustomer(Customer customer) {
		em.merge(customer);

	}

	@Override
	public void deleteCustomer(Customer customer) {
		em.remove(em.merge(customer));

	}

	@Override
	public List<Customer> findAll() {
		return em.createQuery("select d from Customer d", Customer.class).getResultList();

	}

	@Override
	public void delete(Integer id) {
		em.remove(em.find(Customer.class, id));
	}

	@Override
	public List<Customer> findByStatusService(String statusService) {
		// Filter Customers by service type
		return em.createQuery("select d from Customer d where d.statusService_Cutomer=:param")
				.setParameter("param", statusService).getResultList();

	}

	@Override
	public List<Customer> findAllNewRequests() {
		// Demandes en Cours
		return em.createQuery("SELECT d FROM Customer d where statusService_Cutomer='Pending'", Customer.class)
				.getResultList();
	}

	@Override
	public void validateCustomerService(Customer c) {
		c.setStatusService_Cutomer("Valid");
		em.merge(c);
	}

	@Override
	public void rejectCustomerService(Customer c) {
		c.setStatusService_Cutomer("Rejected");
		em.merge(c);
	}

	

	@Override
	public Customer getCustemeById(Integer id) {
		Customer customer = em.find(Customer.class, id);  
		
		return (Customer) customer;
	}

}
