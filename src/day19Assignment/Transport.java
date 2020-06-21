package day19Assignment;

import java.util.Scanner;
import java.util.ArrayList;
public class Transport extends Employee{
Scanner scanner;
ArrayList<Transport> trans;
 Transport(){
	scanner = new Scanner(System.in);
	trans = new ArrayList<Transport>();
}
void ChooseActionForUser() {
	int userChoice = 0;
	do {
		System.out.println("--------------------");
		System.out.println("Press 1 Add Driver");
		System.out.println("Press 2 to Add Bus");
		System.out.println("Press 3 to Add Employee");
		System.out.println("Press 4 to Edit Driver Details");
		System.out.println("Press 5 to Edit Bus Details");
		System.out.println("Press 6 to Delete Driver");
		System.out.println("Press 7 to Delete Bus");
		System.out.println("Press 8 to DeleteEmployee");
		System.out.println("Press 9 to Assign Driver For Bus");
		System.out.println("Press 10 to AssignBusForEmployee");
		System.out.println("Press 0 Exit");
		System.out.println("--------------------");
		userChoice  = scanner.nextInt();
		switch (userChoice ) {
		case 1:	
			adddriverAccounts();
			break;
		case 2:	
			addbusAccounts();
			break;
		case 3:	
			addEmployeeAccounts();
			break;
		case 4:	
			editDriver();
			break;
		case 5:
			editbus();
			break;
		case 6:	
			deletecustomerDetails();
			break;
		case 7:	
			deleteBusDetails();
			break;
		case 8:
			deleteEmployeeDetails();
			break;
		case 9:	
			getBusDetils();
			break;
		case 10:
			getEmployeeDetailsfromUser();
			break;	
		case 0:
			System.out.println("Exiting...../n Thankyou");
			break;
		default:
			System.out.println("Invalid option.. Please press the correct number");
			break;
		}
		
	} while (userChoice!=11);
	
}
public static void main(String[] args) {
	Transport obj= new Transport();
	/*mudinchu.adddriverAccounts();
	mudinchu.addbusAccounts();	
	mudinchu.addEmployeeAccounts();
	mudinchu.printdriveraccount();
	mudinchu.printbusaccount();
	mudinchu.printEmloyeeaccount();*/
	obj.ChooseActionForUser();
	
}

}
