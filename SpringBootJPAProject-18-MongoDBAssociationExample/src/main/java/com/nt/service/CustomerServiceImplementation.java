package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.ParentClassPerson;
import com.nt.repository.ChildClassDrivingLicenseRepo;
import com.nt.repository.ParentClassPersonRepo;
@Service("service")
public class CustomerServiceImplementation implements ICustomerService {
	@Autowired
	private ChildClassDrivingLicenseRepo childrepo;
	@Autowired
	private ParentClassPersonRepo parentrepo;
	
	@Override
	public String insertParentDetailsByChild(ParentClassPerson person) {
		return "Detailes inserted with person id "+parentrepo.save(person).getPid();
	}

}
