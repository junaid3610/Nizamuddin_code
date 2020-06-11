package day12Assignment;

import java.util.Scanner;
interface CustomerManager{
void solveIssues();
void approveLoan();
public static void CustomerManagerMethod() {
		System.out.println("This is in the customer interface--static method");
	}
}
interface EmployeeManager{
	 void dailyMeeting();
	 void setTarget();
	 public static void employeemanagerMethod() {
			System.out.println("This is in the employee interface--static method");
		}
}

abstract class Employee{
	int id;
	String name,phone,designation;
	float salary;
	Scanner scanner;
	
	{
	scanner = new Scanner(System.in);
	}
	abstract void EmployeeDetails();
	//abstract void customerDetails();
}

class Manager extends Employee implements CustomerManager,EmployeeManager {


	@Override
	public void dailyMeeting() {
		// TODO Auto-generated method stub
		System.out.println("Everyday morning 9am to 9.30am");
		System.out.println("=====================================");		
		}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("Employee need to achieve get 15 loan applications for the month");
		System.out.println("==========================================");
		}

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Listening the customer issue from manager ");
		System.out.println("Dear Customer, Please contact  admin for issues");
		System.out.println("===================================");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Dear customer,Loan Approved");
		System.out.println("==============================================");
		
	}

	@Override
	void EmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("EMPLOYEE DESIGNATION ");
		System.out.println("``````````````````````````````````");
		System.out.println("enter the Employee id ");
		id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the Employee name ");
		name=scanner.nextLine();
		System.out.println("Please enter the Employee phone ");
		phone=scanner.nextLine();
		System.out.println("Please enter the Employee salary ");
		salary=scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Please enter the Employee designation ");
		designation=scanner.nextLine();
		System.out.println("The Employee  Id is  "+id);
		System.out.println("The Employee  Name is  "+name);
		System.out.println("The Employee  Phone number is  "+phone);
		System.out.println("The Employee  Salary is  "+salary);
		System.out.println("The Employee  Designation are "+designation);
System.out.println("---------------------------------------");
		
		
		
	}

	}
public class Office{
	public static void main(String[] args) {
		Manager manager = new Manager();
		
	CustomerManager CustomerManagerObj;
		CustomerManagerObj=manager;
		CustomerManagerObj.solveIssues();
		CustomerManagerObj.approveLoan();
		
		EmployeeManager EmployeeManagerObj;
		EmployeeManagerObj=manager;
		manager.EmployeeDetails();
		EmployeeManagerObj.dailyMeeting();
		EmployeeManagerObj.setTarget();
	}
}
