package com.netjstech.service;
import java.util.*;
import com.netjstech.entities.Customer;
public interface CustomerService {
	public Customer addCustomer(Customer cust);
	public void deleteCustomerById(int id);
	List<Customer> getAllCustomer();
	List<Customer> getByTransaction(double amount);
	public Customer updateCustomer(Customer cust);
	}



