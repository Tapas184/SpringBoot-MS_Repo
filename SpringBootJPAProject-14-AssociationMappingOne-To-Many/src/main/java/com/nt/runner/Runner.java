package com.nt.runner;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IPersonManagementService;

import lombok.NonNull;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private IPersonManagementService personService;
	@Override
	public void run(String... args) throws Exception {
		//=========================Parent  to Child=======================
		//create Phone Number object with data
		/*PhoneNumber ph1 = new PhoneNumber(9937707397L, "Bsnl", "Odisha");
		PhoneNumber ph2 = new PhoneNumber(9699845639L, "Jio", "Khordha");
		
		//create set Collection and add phone number list to set colelction
		Set<PhoneNumber> set = new HashSet();
		set.add(ph1); set.add(ph2);
		
		//create person object
		Person per = new Person("Subhankar", "Bhadrak", set);
		String result=personService.savePerson(per);
		System.out.println(result);*/
		//================================Save Operation Child to Parent=================
		/*PhoneNumber ph1 = new PhoneNumber(6377349434L, "Airtel", "Odisha");
		PhoneNumber ph2 = new PhoneNumber(78579973747L, "Vi", "Koraput");
		//create Person object
		Person per = new Person("Rajesh", "Koraput");
		ph1.setPerson(per); ph2.setPerson(per);
		Set<PhoneNumber> phoneSet = Set.of(ph1,ph2);
		per.setContactDetails(phoneSet);
		System.out.println(personService.savePhoneNumbers(phoneSet));*/
		//=================Load Operation Parent to child======================
		personService.fetchByPerson().forEach(Per->{
			System.out.println("Parent::"+Per.getName());
			Set<PhoneNumber> child = Per.getContactDetails();
			child.forEach(chil->{
				System.out.println("PhoneNumber :: "+chil);
			});
			
		});
	}//run(-)

}//class
