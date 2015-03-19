package db;

import java.sql.*;
import java.util.List;

import model.Customer;

//fuck fuck fuck not done

public class DbCustomer implements DbCustomerInterface {

	@Override
	public List<Customer> getAllCustomers() {
		return miscWhere("");
	}

	@Override
	public Customer findCustomer(int id) {
		Customer c = singleWhere("id_customer = " + id);
		return c;
	}

	@Override
	public List<Customer> searchCustomer(String name) {
		return miscWhere("customerName LIKE '%" + name +"%'");
	}

	@Override
	public int updateCustomer(Customer c) {
		int res = 0;
		String s = "UPDATE Customer SET"
		return res;
	}

	@Override
	public int removeCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

}
