package com.nt.runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.ChildClassDrivingLicence;
import com.nt.document.ParentClassPerson;
import com.nt.service.ICustomerService;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private ICustomerService service;
	@Override
	public void run(String... args) throws Exception {
		// create parent object
		ParentClassPerson per = new ParentClassPerson();
		//set details through setter method
		per.setPid(new Random().nextInt(484475));
		per.setName("Tapas");
		per.setAddrs("Balasore,Odisha");
		
		//create child object
		ChildClassDrivingLicence child = new ChildClassDrivingLicence();
		//set child properties through setter method
		child.setType("Two-Wheeler");
		child.setId(new Random().nextInt(60470406));
		child.setExpiryDate(LocalDateTime.of(2038, 05, 15, 12, 00));
		
		//insert child data to parent
		per.setLicense(child);
		
		System.out.println(service.insertParentDetailsByChild(per));
	}

}
