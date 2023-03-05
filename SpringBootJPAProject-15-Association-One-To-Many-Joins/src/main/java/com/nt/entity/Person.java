package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "OTM_PERSON1")
@AllArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class Person implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	@Column(length = 15)
	private String padrs;
	@NonNull
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Person_ID",referencedColumnName = "PID")
	private Set<PhoneNumber> contactDetails;

	public Person() {
	System.out.println("Person:0- Param Constructor");	
	}
	

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", padrs=" + padrs + "]";
	}


	public Person(@NonNull String name, @NonNull String padrs) {
		super();
		this.name = name;
		this.padrs = padrs;
	}
	
	

}
