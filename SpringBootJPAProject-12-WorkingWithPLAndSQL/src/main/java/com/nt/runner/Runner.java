package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IVacineService;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private IVacineService service;
	@Override
	public void run(String... args) throws Exception {
		//service.searchByPriceRange(200.0, 500.0).forEach(System.out::println);
		//System.out.println(service.authentication("tapas", "rt"));
		String[] result = (String[]) service.getEmpDetailsByEmoNO(102);
		System.out.print(result[0]+" "+result[1]+" "+result[2]);
	}//run

}//class
