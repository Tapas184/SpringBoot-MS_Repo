package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {
	//@Query("SELECT p.pid,p.name,p.padrs,ph.phoneNumber,ph.provider,ph.state FROM Person p INNER JOIN p.contactDetails ph")
	//@Query("SELECT p.pid,p.name,p.padrs,ph.phoneNumber,ph.provider,ph.state FROM Person p RIGHT JOIN p.contactDetails ph")
	//@Query("SELECT p.pid,p.name,p.padrs,ph.phoneNumber,ph.provider,ph.state FROM Person p LEFT JOIN p.contactDetails ph")
	@Query("SELECT p.pid,p.name,p.padrs,ph.phoneNumber,ph.provider,ph.state FROM Person p FULL JOIN p.contactDetails ph")

	public List<Object[]> fetchByBothTable();

}//class
