package com.nt.mongorepo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Person;

public interface IPersonRepo extends MongoRepository<Person, Integer> {
	

}
