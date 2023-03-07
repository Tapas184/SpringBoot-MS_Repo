package com.nt.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Document
public class ParentClassPerson implements Serializable {
	@Id
	private Integer pid;
	private String name;
	private String addrs;
	
	private ChildClassDrivingLicence license;

	public ParentClassPerson() {
		System.out.println("ParentClassPerson::0-Param constructor");
	}

	@Override
	public String toString() {
		return "ParentClassPerson [pid=" + pid + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
	

}//class
