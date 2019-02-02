package com.SpringProjet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDaoImple;
	public void addEmployee(Employee emp) throws ClassNotFoundException {
	
		employeeDaoImple.addEmployee(emp);
	}
}
