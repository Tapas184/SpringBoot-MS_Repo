package com.nt.runner;

import java.time.LocalDateTime;
import java.util.*;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Person;
import com.nt.service.IPersonService;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private IPersonService service;
	
	@Override
	public void run(String... args) throws Exception {
		//prepared customer object
		Person per = new Person();
		per.setId(new Random().nextInt(10000));
		per.setAccademics(List.of("b-Tech","+2 In Science","10th"));
		per.setAddrs("Balasore,Odisha,756042");
		per.setBank(Map.of("SBI",567488593033L,"UCO",994858347475L,"PayTm",9668204639L));
		per.setDob(LocalDateTime.of(1995, 04, 02, 17, 48));
		per.setFriendsName(new String[]{"Subha","Abhi","Alok","Selly"});
		Properties pros = new Properties();
		pros.put("ATM-PIN", "9668"); pros.put("SBI-PIN", "1995");
		per.setGovIdCard(pros);
		per.setMerriterials(false);
		per.setName("Tapas Rout");
		
		System.out.println(service.registerPersonDetails(per));
	}//run

}
