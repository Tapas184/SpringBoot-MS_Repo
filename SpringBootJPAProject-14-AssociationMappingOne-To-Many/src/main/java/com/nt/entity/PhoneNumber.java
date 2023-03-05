
/*Person and Phone number relationship is 'ONE TO MANY' relationship from person perspective becoz one person can have 
 * multiple phoneNumber. The same is 'MANY TO ONE' relationship from phoneNumber perspective multiple phone number
 * can belongs to single person
 */
//=============================================PhoneNumber=================================================
package com.nt.entity;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "OTM_PHONENUMBER")
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {
	@Id
	@SequenceGenerator(name = "gen_1",sequenceName = "regno_seq",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen_1")
	private Long regNo;
	@NonNull //this column is mandatory to give input
	private Long phoneNumber;
	@NonNull  //this column is mandatory to give input
	@Column(length = 15)//set Column length
	private String provider;
	@NonNull  //this column is mandatory to give input
	@Column(length = 10)//set Column length
	private String state;
	
	
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID") //FK Column
	private Person person; //Many to one Association

	public PhoneNumber() {
		System.out.println("PhoneNumber::0-ParamConstructor"+this.getClass());
	}//constructor

	@Override
	public String toString() {
		return "PhoneNumber [phoneNumber=" + phoneNumber + ", provider=" + provider + ", state=" + state + "]";
	}//to string(-)

}//class
