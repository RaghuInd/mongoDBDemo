package com.employee.demo;

public class Address {
	private Integer doorNo;
	private String city;
	private String pincode;

	public Address() {
		super();
	}

	public Address(Integer doorNo, String city, String pincode) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.pincode = pincode;
	}

	public Integer getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
