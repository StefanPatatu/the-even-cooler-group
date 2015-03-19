package db;

import java.util.List;
import model.Customer;

public interface DbCustomerInterface {
	public List<Customer> getAllCustomers();
	public Customer findCustomer(int id);
	public List<Customer> searchCustomer(String name);
	public int updateCustomer(Customer c);
	public int removeCustomer(Customer c);
	public int insertCustomer(Customer c);
}
