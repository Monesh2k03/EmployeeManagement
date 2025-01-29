package EmployeeDetails;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose any one operation:-\n1.Create Schema      2.Create Table        3.Insert Data\n"
					+ "4.Show Data     5.Update Existing Data      6.Delete Data by ID     7.Delete Current Table\n8.Sort Data        9.Exit");
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1: CreateEmpDB schema = new CreateEmpDB(); schema.call(); break;
			case 2: CreateEmpTable table = new CreateEmpTable(); table.call(); break;
			case 3: InsertEmpData insert = new InsertEmpData(); insert.call(); break;
			case 4: SelectEmpData select = new SelectEmpData(); select.call(); break;
			case 5: UpdateEmpData update = new UpdateEmpData(); update.call(); break;
			case 6: DeleteEmpData delete = new DeleteEmpData(); delete.call(); break;
			case 7: DropEmployeeTable drop = new DropEmployeeTable(); drop.call(); break;
			case 8: SortingEmpData sort = new SortingEmpData(); sort.call(); break;
			
			}
			if(choice == 9) {
				System.out.println("Exiting......");
				break;
			}
			
			
		}
	}

}
