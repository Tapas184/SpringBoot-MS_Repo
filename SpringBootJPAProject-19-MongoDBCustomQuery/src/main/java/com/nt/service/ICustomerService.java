package com.nt.service;

import java.util.*;

import com.nt.document.Customer;

public interface ICustomerService {
	
	public List<Object[]> fetchCustomerDataByCid(Integer cid);
	
	public List<Customer> fetchCustomerByAddress(String add1);
	
	public List<Customer> fetchCustomerByBillamountRange(double start, double end);
	
	public List<Customer> fetchCustomerByAddOrBillRange(String add, double start, double end);

}//Interface
