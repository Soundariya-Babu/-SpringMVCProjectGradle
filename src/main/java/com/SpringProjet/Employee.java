package com.SpringProjet;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private String name;
	private String rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	@Required
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public Employee(String name, String rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

}
