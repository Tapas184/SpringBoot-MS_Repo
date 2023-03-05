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
	}//fetchByPerson
	@Override
	public String deletePhoneNumberByPersonId(Integer personId) {
		//find person details by person id and keep in Opt collections
		Optional<Person> opt = personRepo.findById(personId);
		if(opt.isPresent()) {//if opt collection is not empty thrn
			Set<PhoneNumber> child = opt.get().getContactDetails();
			child.forEach(chil->{
				chil.setPerson(null);
			});
			phoneRepo.deleteAll(child);
			return child.size()+" no. of records are deleted of "+personId;
		}
		return personId+" Not Found";
	}
}
