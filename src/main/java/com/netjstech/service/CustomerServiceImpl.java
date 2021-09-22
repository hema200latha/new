package com.netjstech.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.netjstech.Repository.CustomerRepository;
import com.netjstech.entities.Customer;

public class CustomerServiceImpl  implements CustomerService{
	@Autowired
    private CustomerRepository repository;
	@Override
	public List<Customer> getAllCustomer() {
		return (List<Customer>)repository.findAll();
	}

	@Override
	public Customer addCustomer(Customer cust) {
		return repository.save(cust);
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		Customer customer =repository.findById(cust.getCustomerid()).orElseThrow(
				() -> new EntityNotFoundException("no customer found by the id"));
		customer.setCustomerName(cust.getCustomerName());
		return repository.save(customer); 
	}

	@Override
	public void deleteCustomerById(int id) {
		repository.deleteById(id);
		
	}

		@Override
	public List<Customer> getByTransaction(double amount) {
		return (List<Customer>)repository.findByAmount(amount);
	}

	
}


