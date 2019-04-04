package com.ibm.core.employee.xmlconfig;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	String city;
	String country;
	int pin;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	
	

}
