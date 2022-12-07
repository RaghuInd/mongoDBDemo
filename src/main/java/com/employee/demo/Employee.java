package com.employee.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Document//("employees")
public class Employee {
	@Id
	private String id;
	//@NotBlank(message = "Employee name can't be blank.")
	//@Size(min=3, max=30, message = "Name must be at least 3 and max 30 chars")
	//@NotNull(message = "Employee name can't be null.")
	//@Pattern(regexp="[A-Za-z]{3,30}", message= "Name must be alphabets having min 3 to max 30 chars.")
	private String name;
	//@Min(value = 0,message = "Salary must be greater than 0.")	
	private Double salary;
	// employee has depencdency on Address
	private Boolean active;	
	
	private Address address;
	
	
	
	//private Department department;
	

	
	public Employee() {
		super();
	}
	public Employee(String id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
public Employee(String id, String name, Double salary, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.active = active;
	}
//	public Employee(Integer id, String name, Double salary, Address address, Department department) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.address = address;
//		this.department = department;
//	}
	
//	public Department getDepartment() {
//		return department;
//	}
//	public void setDepartment(Department department) {
//		this.department = department;
//	}

	public String getId() {
		return id;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
