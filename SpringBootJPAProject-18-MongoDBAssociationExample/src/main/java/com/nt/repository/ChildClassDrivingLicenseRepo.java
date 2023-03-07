package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.ChildClassDrivingLicence;

public interface ChildClassDrivingLicenseRepo extends MongoRepository<ChildClassDrivingLicence, Integer> {

}
