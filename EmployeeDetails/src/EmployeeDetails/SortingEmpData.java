package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SortingEmpData implements CommonMethod {

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name = "root";
		String password = "9385";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select How to Sort Data\n1.Sort by Name     2.Sort by Salary");
		int choice = scan.nextInt();
		
		
		if(choice == 1) {
			String query = "SELECT * FROM emp ORDER BY empName";
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query)){
				
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("empName");
					String empDept = rs.getString("empDept");
					int empSalary = rs.getInt("empSalary");
					int empExp = rs.getInt("empExp");
					System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp );
					
				}
				
				
			}catch(Exception error) {
				error.printStackTrace();
			}
		}
		
		
		
		if(choice == 2) {
			String query = "SELECT * FROM emp ORDER BY empSalary";
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query)){
				
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("empName");
					String empDept = rs.getString("empDept");
					int empSalary = rs.getInt("empSalary");
					int empExp = rs.getInt("empExp");
					System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp );
					
				}
				
				
			}catch(Exception error) {
				error.printStackTrace();
			}
		}
		
		
		
	}
	
}
