package com.nt.mongorepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Customer;

public interface IMongoRepo extends MongoRepository<Customer, String> {

}
