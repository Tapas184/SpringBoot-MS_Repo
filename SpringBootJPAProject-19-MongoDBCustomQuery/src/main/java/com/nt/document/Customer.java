package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Customer {
	@Id
	private String id;
	private Integer cId;
	private String cName;
	private String cAdd;
	private Double cBillAmt;
	private Long phoneNumber;
	public Customer() {
		System.out.println("Customer::0-Param constructor");
	
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cId=" + cId + ", cName=" + cName + ", cAdd=" + cAdd + ", cBillAmt=" + cBillAmt
				+ ", phoneNumber=" + phoneNumber + "]";
	}//constructor
	
	
	

}
