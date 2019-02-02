package com.SpringProjet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	final static String Url="jdbc:mysql://localhost:3306/project";
    final static String Username="root";
    final static String Password="pass123$";
	public void addEmployee(Employee Emp) throws ClassNotFoundException {
			try {
		
			    Class.forName("com.mysql.jdbc.Driver");
			    Connection con=DriverManager.getConnection(Url,Username,Password);
				PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
				ps.setString(1,Emp.getRollNo());
				ps.setString(2,Emp.getName());
				int t=ps.executeUpdate();
				if(t>0) {
					System.out.println("true");
				}
				else
				{
					System.out.println("false");
				}
				if(con!=null)
					{
					try {
						con.close();
						}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
					} 
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		
		}
}
