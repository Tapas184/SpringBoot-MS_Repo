package com.nt.service;

import java.util.*;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IPersonManagementService {
	public String savePerson(Person per);
	
	public String savePhoneNumbers(Iterable<PhoneNumber> phone);
	
	public List<Person> fetchByPerson();
	
	public String deletePhoneNumberByPersonId(Integer personId);

}//Interface