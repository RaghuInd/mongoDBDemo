package com.employee.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	List<Employee> findByActiveTrue();
	List<Employee> findByActiveFalse();

}
