package com.nt.service;

import java.util.*;

import com.nt.document.Customer;

public interface ICustomerService {
	
	public String insertDetailsIByCustomer(Customer cust);
	
	public List<Customer> searchCustomerByAdd(String add);
	
	public List<Customer> searchByBillrange(double start, double end);
	
}//Interface
