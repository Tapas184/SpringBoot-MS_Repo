package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;

@Service("service")
public class CustomerService implements ICustomerService {
	@Autowired
	private MongoTemplate template;
	
	@Override
	public String insertDetailsIByCustomer(Customer cust) {
		Customer t=template.save(cust);
		return "Customer Deatils inserted with id ::"+t.getCId();
	}
	@Override
	public List<Customer> searchCustomerByAdd(String add) {
		    Query query = new Query();
		    query.addCriteria(Criteria.where("cAdd").is(add));
		    List<Customer> list = template.find(query,Customer.class);
		return list;
	}

}
