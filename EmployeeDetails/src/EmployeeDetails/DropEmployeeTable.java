package EmployeeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DropEmployeeTable implements CommonMethod {

	@Override
	public void call() {
		String url = "jdbc:mysql://localhost:3306/employee";
		String name = "root";
		String password = "9385";
		
		try(Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Type `Yes` if want to Delete the Table");
			String choice = scan.next();
			
			if(choice.equalsIgnoreCase("yes")) {
			String query = "DROP TABLE emp";
			stmt.executeUpdate(query);
			System.out.println("Table Successfully Deleted......");
			}
			
			
			con.close();
		}catch(Exception error) {
			error.printStackTrace();
		}
		
	}
	
}
