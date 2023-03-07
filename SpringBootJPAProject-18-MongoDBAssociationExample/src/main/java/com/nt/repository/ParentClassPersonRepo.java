package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.ParentClassPerson;

public interface ParentClassPersonRepo extends MongoRepository<ParentClassPerson, Integer> {

}
