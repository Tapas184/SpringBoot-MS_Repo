package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//model class of the project
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer empid;
	private String ename;
	private Double esalary;

}//end of Employee class
