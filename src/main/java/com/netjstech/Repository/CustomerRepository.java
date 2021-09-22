package com.netjstech.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.netjstech.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	@Query("Select c from Customer c where c.id in(select t.customer from Transaction t where t.amount>:amt)")
	public List<Customer> findByAmount(@Param("amt")double amount);

}

