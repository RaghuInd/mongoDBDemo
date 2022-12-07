package com.employee.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@GetMapping("/")
	public String greet() {
		return "Mongo Repository Demo";
	}
	@PostMapping("employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeRepo.save(employee);
	}
	@GetMapping("employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		return this.employeeRepo.findById(id).get();
	}
	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeRepo.save(employee);
	}
	@DeleteMapping("employee/{id}")
	public Employee deleteEmployeeById(@PathVariable("id") String id) {
		Employee emp =this.employeeRepo.findById(id).get();
		
		this.employeeRepo.deleteById(id);
		return emp;
	}
	@GetMapping("active/employees")
	public List<Employee> getAllActiveEmployees(){
		return this.employeeRepo.findByActiveTrue();
	}
	@GetMapping("inactive/employees")
	public List<Employee> getAllInActiveEmployees(){
		return this.employeeRepo.findByActiveFalse();
	}
}
