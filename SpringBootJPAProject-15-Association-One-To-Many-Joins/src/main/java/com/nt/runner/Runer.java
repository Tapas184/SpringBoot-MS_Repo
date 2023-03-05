package com.nt.runner;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.ICustomerService;

@Component
public class Runer implements CommandLineRunner {
	@Autowired
	private ICustomerService service;

	@Override
	public void run(String... args) throws Exception {

		// create Phone number
		PhoneNumber ph1 = new PhoneNumber(978700388392L, "Idea", "WestBengal");
		PhoneNumber ph2 = new PhoneNumber(784874900022L, "Reliance", "Gujrat");

		/*	//create a set object and add Phone number to that object
			//Set<PhoneNumber> child = new HashSet();
			//child.add(ph1); child.add(ph2);
			Set<PhoneNumber> child = Set.of(ph1,ph2);
			//Add those phone numbers to person 
			Person per = new Person("Ramesh","Khordha",child);
			//invok the business method
			String result=service.insertDetails(per);
			//print ther output
			System.out.println(result);*/
		service.fetchDataByJoinsUsingParents().forEach(row->{
			for(Object obj:row) {
				System.out.print(obj+" ");
			}
			System.out.println();
		});

	}

}
