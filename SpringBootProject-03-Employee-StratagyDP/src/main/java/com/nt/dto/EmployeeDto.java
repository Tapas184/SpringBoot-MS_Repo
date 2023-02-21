//Employee Dto(Data Transfer object)
package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable {
	private Integer slNumber;
	private Integer empNo;
	private String ename;
	private Double sal;
	private String job;

}//class
