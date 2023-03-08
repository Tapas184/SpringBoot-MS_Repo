package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICustomerService;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private ICustomerService service;
	@Override
	public void run(String... args) throws Exception {
		//==================Find By ID=================================
		/*		service.fetchCustomerDataByCid(1005).forEach(cust->{
					for(Object obj:cust) {
						System.out.print(obj+" ");
					}
					System.out.println();
				});*/
		//================Find By address=========================
		//service.fetchCustomerByAddress("Odisha").forEach(System.out::println);
		//service.fetchCustomerByBillamountRange(400.0, 1200.00).forEach(System.out::println);
		//service.fetchCustomerByAddOrBillRange("Odisha", 400.0, 1000.0).forEach(System.out::println);
		//service.fetchCustomerByCharacter("^K").forEach(System.out::println);
		//service.fetchCustomerByNameAssending().forEach(System.out::println);
		/*boolean output=service.fetchIsCustomerAvailabe(10);
		if(output!=true) {
		 System.out.println("Customer not availabe");
		}
		else
		 System.out.println("Customer availabe");*/
	}//run(-)

}//class
