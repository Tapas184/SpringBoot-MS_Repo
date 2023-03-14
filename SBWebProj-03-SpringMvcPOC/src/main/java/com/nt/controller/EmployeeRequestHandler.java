package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;


//class for request mapping
@Controller
public class EmployeeRequestHandler {
	
     //create a method for handling Home page
	@GetMapping(value = "/")
	public  String homePageMapping() {
		System.out.println("EmployeeRequestHandler");
		return "home";
	}
	
	@GetMapping(value = "/reg_emp")
	public String mappRegEmpRequest() {
		System.out.println("EmployeeRequestHandler. Execute");
		return "register";
	}//end of mappRegEmpRequest()
	
	@PostMapping(value = "/reg_emp")
	public String mappFormPageRequest(Map<String,Object> map , 
			                           @ModelAttribute("emp") Employee emp) {
		
		return "result";
	}
	
}//class
