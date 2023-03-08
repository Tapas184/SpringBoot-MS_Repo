package com.nt.repository;

import java.util.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Customer;

public interface ICustomerRepository extends MongoRepository<Customer, String> {
	
	@Query(fields = "{}",value = "{cId:?0}")
	//Select All columns from customer table where cid=cid
	public List<Object[]> selectCustomerDataByCid(Integer cid);
	
	//using query by and
	@Query(fields = "{id:0,cId:1,cName:1,cAdd:1,cBillAmt:1}",value = "{cAdd:?0}")
	public List<Customer> selectCustomerListByAddress(String add1);
	
	//Select Customer By Bill range(>= and <=)
	@Query(fields ="{id:0,cId:1,cName:1,cAdd:1,cBillAmt:1,phoneNumber:1}",value = "{cBillAmt:{$gte:?0,$lte:?1}}")
	public List<Customer> selectCustomerByBillRange(double start, double end);
	
	//examples of or operator
	@Query(fields ="{id:0,cId:1,cName:1,cAdd:1,cBillAmt:1,phoneNumber:1}", value = "{$or: [{cAdd:?0}, {cBillAmt: {$gte:?1, $lte:?2}}]}")
	public List<Customer> selectCustomerByAddressOrBillRange(String add, double start, double end);

}//Interface

