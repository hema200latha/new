package com.netjstech.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com. netjstech.entities.Customer;
import com.netjstech.service.CustomerService;

		@RestController
		public class CustomerController {
			@Autowired
			CustomerService CustomerService;
			
			@GetMapping
			public List<Customer> getAllCustomer(){
				return CustomerService.getAllCustomer();
			}
			@PostMapping("/customer")
			@ResponseStatus(HttpStatus.CREATED)
			public Customer addCustomer(@RequestBody Customer cust) {
				 return CustomerService.addCustomer(cust);
			}
			@PutMapping
			public Customer updateCustomer(@RequestBody Customer cust) {
				return CustomerService.updateCustomer(cust);
			}
			@GetMapping("/customer/{customerid}")
			public List<Customer> getByTransactions(@PathVariable("amount") double amount) {
				return CustomerService.getByTransaction(amount);
			}
			@DeleteMapping("/customer/{customerid}")
			@ResponseStatus(HttpStatus.OK)
			public void deleteCutomerById(@RequestBody int customerid) {
				CustomerService.deleteCustomerById(customerid);
				
			}
		}


