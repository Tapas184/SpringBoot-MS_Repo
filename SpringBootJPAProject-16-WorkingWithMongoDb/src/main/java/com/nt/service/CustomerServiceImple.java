package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.mongorepo.IMongoRepo;

@Service("service")
public class CustomerServiceImple implements ICustomerService {
	@Autowired
	private IMongoRepo custRepo;

	@Override
	public String insertDetails(Customer cust) {
		Customer value = custRepo.insert(cust);
		if (value != null)
			return "Details inserted" + value.getId();
		else
			return "Problem in Details insert";
	}

	@Override
	public String updateDetailsById(Customer cust) {
		return "Customer Id updated" + custRepo.save(cust).getId();
	}

	@Override
	public Optional<Customer> findById(String id) {
		Optional<Customer> list = custRepo.findById(id);
		return list;
	}

	@Override
	public String deleteById(String id) {
		Optional<Customer> opt=custRepo.findById(id);
		if(opt.isPresent()) {
			custRepo.deleteById(id);
			return id+" Customer details deleted";
		}
		else
		return "Customer not found with this "+id;
	}

}// class
