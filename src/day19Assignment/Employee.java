package day19Assignment;



import java.util.Scanner;

public class Employee extends Driver {

	int busid,age,empid;
	String name,phone,dob;
	Scanner scanner;		
	
	void getemployeeDetails() {
		System.out.println("Please enter the employee id");
		empid = scanner.nextInt();
		scanner.nextLine();
		//System.out.println("Please enter the Bus id");
		//busid = scanner.nextInt();
		//scanner.nextLine();
		System.out.println("Please enter the employee name");
		name = scanner.nextLine();
		System.out.println("Please enter the employee age");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the employee phone");
		//System.out.println(maskString(phone, 0, 4, '*') );
		phone = scanner.nextLine();
		dob= scanner.nextLine();
		System.out.println("Please enter Date of Birth DD/MM/YYYY");
	
	
}
	
	
	
}