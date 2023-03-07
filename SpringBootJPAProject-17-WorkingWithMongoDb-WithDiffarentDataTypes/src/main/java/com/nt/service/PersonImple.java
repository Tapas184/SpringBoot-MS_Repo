package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Person;
import com.nt.mongorepo.IPersonRepo;
@Service("service")
public class PersonImple implements IPersonService {
	@Autowired
	private IPersonRepo repo;

	@Override
	public String registerPersonDetails(Person per) {
		return " Person Details registered with "+repo.save(per).getId();
	}

}
