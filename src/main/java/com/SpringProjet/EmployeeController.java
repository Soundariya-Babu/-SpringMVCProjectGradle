package com.SpringProjet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeServiceimple;
	
	 
	 @GetMapping("/store")	 
public String Store(@RequestParam("userId") String userId, 
		@RequestParam("userName") String userName) 
				
{
    Employee emp=new Employee(userId,userName);
	try {
		employeeServiceimple.addEmployee(emp);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return "../First";
}
}
