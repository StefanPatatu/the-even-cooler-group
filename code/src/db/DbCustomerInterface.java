package db;

import java.util.List;
import model.Customer;

public interface DbCustomerInterface {
	public List<Customer> getAllCustomers(boolean retrieveAssoc);
	public Customer findCustomer(int id_customer, boolean retrieveAssoc);
	public List<Customer> searchCustomer(String name, boolean retrieveAssoc);
	public int updateCustomer(Customer c);
	public int removeCustomer(Customer c);
	public int insertCustomer(Customer c);
}
