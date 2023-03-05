package com.nt.entity;

import java.io.Serializable;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NonNull;
import lombok.*;
@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name = "OTM_PHONENUMBER1")
public class PhoneNumber implements Serializable{
	@Id
	@SequenceGenerator(name ="reg2",initialValue = 100,allocationSize = 1,sequenceName = "reg_no_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "reg2")
	private Long regNo;
	@NonNull
	private Long phoneNumber;
	@NonNull
	@Column(length = 15)
	private String provider;
	@NonNull
	@Column(length = 20)
	private String state;
	
	//parent class properties
	@NonNull
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Person_ID",referencedColumnName = "PID")
	private Person person;
	

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNumber=" + phoneNumber + ", provider=" + provider + ", state="
				+ state + "]";
	}


	public PhoneNumber(@NonNull Long phoneNumber, @NonNull String provider, @NonNull String state) {
		super();
		this.phoneNumber = phoneNumber;
		this.provider = provider;
		this.state = state;
	}


	public PhoneNumber() {
		System.out.println("PhoneNumber::0-Param Constructor");
	}

}
