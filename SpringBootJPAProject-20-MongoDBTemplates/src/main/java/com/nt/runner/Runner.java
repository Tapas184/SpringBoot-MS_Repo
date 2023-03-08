package com.nt.runner;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Customer;
import com.nt.service.ICustomerService;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private ICustomerService service;
	@Override
	public void run(String... args) throws Exception {
		/*		Customer cust = new Customer();
				cust.setCId(new Random().nextInt(10000));
				cust.setCName("Ranjan");
				cust.setCAdd("Balasore");
				cust.setCBillAmt(569.0);
				cust.setPhoneNumber(74889393848L);
				
			String result =	service.insertDetailsIByCustomer(cust);
			System.out.println(result);*/
		service.searchCustomerByAdd("Odisha").forEach(System.out::println);
	}//run(-)

}//class
