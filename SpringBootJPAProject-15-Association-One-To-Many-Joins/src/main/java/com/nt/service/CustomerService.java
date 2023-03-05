package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneRepo;

@Service("services")
public class CustomerService implements ICustomerService {
	@Autowired
	private IPersonRepo personRepo;
	@Autowired
	private IPhoneRepo phoneRepo;
	@Override
	public String insertDetails(Person per) {
		int count = personRepo.save(per).getPid();
		return count+" no.Of details inserted";
	}
	
	@Override
	public List<Object[]> fetchDataByJoinsUsingParents() {
		return personRepo.fetchByBothTable();
	}

}//class
