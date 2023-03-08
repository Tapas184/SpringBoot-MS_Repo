package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.repository.ICustomerRepository;

@Service("service")
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository repo;

	@Override
	public List<Object[]> fetchCustomerDataByCid(Integer cid) {
		return repo.selectCustomerDataByCid(cid);
	}//

	@Override
	public List<Customer> fetchCustomerByAddress(String add1) {
		return repo.selectCustomerListByAddress(add1);
	}//

	@Override
	public List<Customer> fetchCustomerByBillamountRange(double start, double end) {
		return repo.selectCustomerByBillRange(start, end);
	}
	@Override
	public List<Customer> fetchCustomerByAddOrBillRange(String add, double start, double end) {
		return repo.selectCustomerByAddressOrBillRange(add, start, end);
	}
}
