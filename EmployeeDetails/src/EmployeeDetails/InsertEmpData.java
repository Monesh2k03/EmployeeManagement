package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InsertEmpData implements CommonMethod {

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name = "root";
		String password = "9385";
		
		try(Connection con = DriverManager.getConnection(url, name, password);
				)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Employee ID : ");
			int empId = scan.nextInt();
			System.out.println("Enter Employee Name : ");
			String empName = scan.next();
			System.out.println("Enter Employee Department : ");
			String empDept = scan.next();
			System.out.println("Enter Employee Salary : ");
			int empSalary = scan.nextInt();
			System.out.println("Enter Employee Experience : ");
			int empExp = scan.nextInt();
			
			LocalDate join = LocalDate.now();
			DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String formateDate = join.format(form);
			
						
			String query = "INSERT INTO emp (id,empName,empDept,empSalary,empExp,jondate) VALUES(?,?,?,?,?,?)";
			try(PreparedStatement pre = con.prepareStatement(query);){
				pre.setInt(1,empId);
				pre.setString(2, empName);
				pre.setString(3,empDept);
				pre.setInt(4, empSalary);
				pre.setInt(5, empExp);
				pre.setString(6,formateDate);
				int value = pre.executeUpdate();
				System.out.println("Inserted + "+ value + "row(s) into the Employee Table");
				
			}
			
			con.close();
			
		}catch(Exception error) {
			error.printStackTrace();
		}
	}
	
	
}
