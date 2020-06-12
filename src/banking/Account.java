package banking;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Account {
	int accountNumber,age;
	String name,phone,dob,accType;
	double balance;
	Scanner scanner;
	ArrayList<Integer> accountList;
	Account(){
		scanner = new Scanner(System.in);
		accountList = new ArrayList<Integer>();
		
	}

	double checkBalance() {
		
	return balance;	
	}
	
	abstract boolean transact(Account another,String type,double amount);
	
	public String getAccType() {
		return accType;
	}

	void takeAccountDetails(){
		String userChoice = "no";
			do {
		System.out.println("Please enter the type of account");
		accType = scanner.nextLine();
		System.out.println("Please enter the account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		if(accountList.contains(accountNumber)) {
			System.out.println("Account already exists!!");
		}
		else {
			accountList.add(accountNumber);
		System.out.println("please enter name");
		name = scanner.nextLine();
		System.out.println("Please enter Date of Birth");
		dob= scanner.nextLine();
		System.out.println("Please enter Phone number");
		phone = scanner.nextLine();
		System.out.println("Please enter the Initial Amount for deposit");
		balance =scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Created");
		}
		System.out.println("Do u want to enter another??");
		userChoice = scanner.nextLine();
		}while( userChoice.equalsIgnoreCase("yes"));
		
		
	}
		
	
}
