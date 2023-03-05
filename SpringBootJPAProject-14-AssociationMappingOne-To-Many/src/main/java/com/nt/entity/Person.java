/*Person and Phone number relationship is 'ONE TO MANY' relationship from person perspective becoz one person can have 
 * multiple phoneNumber. The same is 'MANY TO ONE' relationship from phoneNumber perspective multiple phone number
 * can belongs to single person
 */
//=======================================Person Entity==============================================================
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
@Setter
@Getter
@Entity
@Table(name = "OTM_PERSON")
@AllArgsConstructor
@RequiredArgsConstructor
public class Person implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	@Column(length = 30)
	private String paddrs;
	
	//@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = person)

	@NonNull
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID")
	private Set<PhoneNumber> contactDetails; // one to Many Association
	
	public Person() {
		System.out.println("Person::0-ParamConstructor"+this.getClass());
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", paddrs=" + paddrs + "]";
	}

	public Person(@NonNull String name, @NonNull String paddrs) {
		super();
		this.name = name;
		this.paddrs = paddrs;
	}//constructor
	
	
}//person
