package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectEmpData implements CommonMethod{

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name = "root";
		String password = "9385";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Which data to See : \n 1.All   2.Find by Name    3.Find by Department   4.Find by Salary    5.Find by Experience");
		int choice = scan.nextInt();
		
		if(choice == 1) {
		
		String query = "SELECT * FROM emp";
		
		try(Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			while(rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("empName");
				String empDept = rs.getString("empDept");
				int empSalary = rs.getInt("empSalary");
				int empExp = rs.getInt("empExp");
				String joinDate = rs.getString("jondate");
				System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp+", Date of Join : "+joinDate);
				
			}
			
			con.close();
			
		}catch(Exception error) {
			error.printStackTrace();
		}
		}
		
		if(choice == 2) {
			System.out.println("Enter the Name to Find : ");
			String Name = scan.next();
			
			String query = "SELECT * FROM emp WHERE empName = ?";
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query);
					){
				pre.setString(1,Name);
				
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("empName");
					String empDept = rs.getString("empDept");
					int empSalary = rs.getInt("empSalary");
					int empExp = rs.getInt("empExp");
					System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp );
					
				}
				
				con.close();
				
			}catch(Exception error) {
				error.printStackTrace();
			}
			}
		
		if(choice == 3) {
			System.out.println("Enter the Department to Find : ");
			String Name = scan.next();
			
			String query = "SELECT * FROM emp WHERE empDept = ?";
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query);
					){
				pre.setString(1,Name);
				
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("empName");
					String empDept = rs.getString("empDept");
					int empSalary = rs.getInt("empSalary");
					int empExp = rs.getInt("empExp");
					System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp );
					
				}
				
				con.close();
				
			}catch(Exception error) {
				error.printStackTrace();
			}
			}
		
		if(choice == 4) {
			System.out.println("Enter the Salary to Find : ");
			int Name = scan.nextInt();
			
			String query = "SELECT * FROM emp WHERE empSalary = ?";
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query);
					){
				pre.setInt(1,Name);
				
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("empName");
					String empDept = rs.getString("empDept");
					int empSalary = rs.getInt("empSalary");
					int empExp = rs.getInt("empExp");
					System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp );
					
				}
				
				con.close();
				
			}catch(Exception error) {
				error.printStackTrace();
			}
			}
		
		if(choice == 5) {
			System.out.println("Enter the Experience to Find : ");
			int Name = scan.nextInt();
			
			String query = "SELECT * FROM emp WHERE empSalary = ?";
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query);
					){
				pre.setInt(1,Name);
				
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("empName");
					String empDept = rs.getString("empDept");
					int empSalary = rs.getInt("empSalary");
					int empExp = rs.getInt("empExp");
					System.out.println("Employee ID : "+empId+", Name : "+empName+", Department : "+empDept+", Salary : "+empSalary+", Experience : "+empExp );
					
				}
				
				con.close();
				
			}catch(Exception error) {
				error.printStackTrace();
			}
			}
		
	}

}
