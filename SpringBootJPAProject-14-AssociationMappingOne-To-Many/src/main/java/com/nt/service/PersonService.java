package com.nt.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumberRepo;

@Service("service")
public class PersonService implements IPersonManagementService {
	@Autowired
	private IPersonRepo personRepo;
	@Autowired
	private IPhoneNumberRepo phoneRepo;

	@Override
	public String savePerson(Person per) {
		int idVal = personRepo.save(per).getPid();
		return "Object is Saved with id ::" + idVal;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> phone) {
		for (PhoneNumber ph : phone) {
			phoneRepo.save(ph);
		}
		return ((Set<PhoneNumber>) phone).size() + " No.of  ohone number saved";
	}@Override
	public List<Person> fetchByPerson() {
		return personRepo.findAll();
	}
}
