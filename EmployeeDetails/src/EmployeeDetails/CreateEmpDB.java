package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmpDB implements CommonMethod {
	
	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/";
		String name = "root";
		String password = "9385";
		
		try(Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				){
			String query = "CREATE SCHEMA employee";
			stmt.executeUpdate(query);
			System.out.println("Schema Created Succesfully for Employees!");
			
			con.close();
			
		}catch(Exception error) {
			error.printStackTrace();
		}
	}
}
