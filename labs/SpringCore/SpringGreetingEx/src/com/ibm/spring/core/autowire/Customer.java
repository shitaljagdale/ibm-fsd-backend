package com.ibm.spring.core.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
   Person person;

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}
  

}
