package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmpTable implements CommonMethod{

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name ="root";
		String password = "9385";
		
		try(Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				){
			String query = "CREATE TABLE emp "+
				"(id INTEGER not NULL, " +
				" empName VARCHAR(45), " +
				" empDept VARCHAR(45), " +
				" empSalary INTEGER, " +
				" empExp INTEGER, " +
				" PRIMARY KEY( id ))";
			
			stmt.executeUpdate(query);
			System.out.println("Employee Table Created Succesfully!");
			
			con.close();
			
		}catch(Exception error) {
			error.printStackTrace();
		}
		
	}
	
}
