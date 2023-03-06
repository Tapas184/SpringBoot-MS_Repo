package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.Customer;

public interface ICustomerService {
	
	public String insertDetails(Customer cust);
	
	public String updateDetailsById(Customer cust);
	
	public  Optional<Customer>  findById(String id);
	
	public String deleteById(String id);
	
}
