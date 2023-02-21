package com.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.bytecode.enhance.internal.tracker.SimpleFieldTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.bean.Orders;
import com.repository.CustomerRepository;

@Service
public class CustomerService {
@Autowired 
CustomerRepository customerRepository;
public String storeCustomerDetails(Customer customer)
{
	Optional<Customer>op=customerRepository.findById(customer.getCid());
	if(op.isPresent())
	{
		return "Already Exist";
	}
	
	else
	{
		customerRepository.save(customer);
		return "Login Successfull"; 
		
		
	}
	
}

public List<Customer> tofindCustomerDetails()
{
	return customerRepository.findAll();
}





}
