package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEmpData implements CommonMethod{

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name = "root";
		String password = "9385";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Which ID to Update : ");
		int empId = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Which data to Change : \n 1.Name    2.Department   3.Salary    4.Experience");
		int changeField = scan.nextInt();
		
		if(changeField == 1) {
			System.out.println("Enter New Name : ");
			String empname = scan.next();
			String query = "UPDATE emp SET empName = ? WHERE id = ?";
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query)){
				pre.setString(1 , empname);
				pre.setInt(2 , empId);
				pre.executeUpdate();
				System.out.println("Name Successfully Updated for ID : "+empId);
				
				
			}catch(Exception error) {
				error.printStackTrace();
			}
		}
		
		if(changeField == 2) {
			System.out.println("Enter New Departement : ");
			String empDept = scan.next();
			String query = "UPDATE emp SET empDept = ? WHERE id = ?";
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query)){
				pre.setString(1 , empDept);
				pre.setInt(2 , empId);
				pre.executeUpdate();
				System.out.println("Department Successfully Updated for ID : "+empId);
				
				
			}catch(Exception error) {
				error.printStackTrace();
			}
		}
		
		if(changeField == 3) {
			System.out.println("Enter New Salary : ");
			int empSalary = scan.nextInt();
			String query = "UPDATE emp SET empSalary = ? WHERE id = ?";
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query)){
				pre.setInt(1 , empSalary);
				pre.setInt(2 , empId);
				pre.executeUpdate();
				System.out.println("Salary Successfully Updated for ID : "+empId);
				
				
			}catch(Exception error) {
				error.printStackTrace();
			}
		}
		
		if(changeField == 4) {
			System.out.println("Enter Current Experience : ");
			int empExp = scan.nextInt();
			String query = "UPDATE emp SET empExp = ? WHERE id = ?";
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pre = con.prepareStatement(query)){
				pre.setInt(1 , empExp);
				pre.setInt(2 , empId);
				pre.executeUpdate();
				System.out.println("Experience Successfully Updated for ID : "+empId);
				
				
			}catch(Exception error) {
				error.printStackTrace();
			}
		}
		
		
		
		
	}
	
}
