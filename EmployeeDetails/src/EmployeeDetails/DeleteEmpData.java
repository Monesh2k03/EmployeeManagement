package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmpData implements CommonMethod {

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name = "root";
		String password = "9385";
		
		try(Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the ID number : ");
			String empID = scan.next();
			
			String query = "DELETE FROM emp WHERE id = "+empID;
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("empName");
				String empDept = rs.getString("empDept");
				int empSalary = rs.getInt("empSalary");
				int empExp = rs.getInt("empExp");
				System.out.println("Employee ID : "+empId+" Name : "+empName+" Department : "+empDept+" Salary : "+empSalary+" Experience : "+empExp+" DELETED ");
				
			}
			
			con.close();
			
		}catch(Exception error) {
			error.printStackTrace();
		}
	}
	
}
