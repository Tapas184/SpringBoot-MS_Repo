package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Customer;
import com.nt.generator.Generator;
import com.nt.service.ICustomerService;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private ICustomerService service;

	@Override
	public void run(String... args) throws Exception {
		//===============Insert Method with details===============================
		/*		Customer cust = new Customer();
				cust.setCId(1001);
				cust.setCName("Tapas");
				cust.setCAdd("Odisha");
				String result=service.insertDetails(cust);
				System.out.println(result);*/
		//====================Insert method with custom random Generated id==================
		/*Customer cust = new Customer();
		cust.setId(Generator.randomIdGenerator());
		cust.setCId(105);
		cust.setCName("Ram");
		cust.setCAdd("Hyderabad");
		cust.setCBillAmt(1100.0);
		cust.setPhoneNumber(988747588L);
		String result=service.insertDetails(cust);
		System.out.println(result);*/
		//============================Update method============================
		/*		Customer cust = new Customer();  //"c44d3ad709c"
				cust.setId("dada58b6c17");
				cust.setCId(1002);
				String result=service.updateDetailsById(cust);
				System.out.println(result);*/
		/*Customer cust = new Customer();
		Optional<Customer> opt=service.findById("c44d3ad709c");
		if(opt.isPresent()) {
			cust.setCAdd(opt.get().getCAdd());
			cust.setCBillAmt(opt.get().getCBillAmt());
			cust.setCName(opt.get().getCName());
			cust.setPhoneNumber(opt.get().getPhoneNumber());
			cust.setCId(1005);
			cust.setId("c44d3ad709c");
			service.updateDetailsById(cust);
			System.out.println("Customer details updated");
		}
		else {
			System.out.println("Customer Not Found ");
		}*/
		//=========================Delete Operation By Id==================
		/*String result = service.deleteById("c44d3ad709c");
		System.out.println(result);*/
	}//run(-)
}//class
