package com.nt.document;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter

public class ChildClassDrivingLicence implements Serializable {
	@Id
	private  Integer id;
	private String type;
	private LocalDateTime expiryDate;
	
	private ParentClassPerson person;

	public ChildClassDrivingLicence() {
		System.out.println("ChildClassDrivingLicence::0- Param constructor");
	}

	@Override
	public String toString() {
		return "ChildClassDrivingLicence [id=" + id + ", type=" + type + ", expiryDate=" + expiryDate + "]";
	}
	
	
}//class
