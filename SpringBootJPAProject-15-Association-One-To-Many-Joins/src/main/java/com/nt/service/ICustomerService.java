package com.nt.service;

import java.util.*;

import com.nt.entity.Person;

public interface ICustomerService {
	
	public String insertDetails(Person per); 
	
	public List<Object[]> fetchDataByJoinsUsingParents();

}//service class
