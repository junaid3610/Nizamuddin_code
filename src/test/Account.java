package test;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;


public class Account{
	private String account_number, name, password, phone;
	private double balance;
	Scanner scanner;
	ArrayList<String> accountList;
	ArrayList<Account> accList;
	Console console = System.console();
	//constructor to perform initializations
			Account(){
				scanner = new Scanner(System.in);
				accountList = new ArrayList<String>();
				accList = new ArrayList<Account>();
			}
			
	//Getters

	public String getAccount_number() {
		return account_number;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public double getBalance() {
		return balance;
	}
	
	//Setters
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//toString method overriden to return the details of an account when called with the object
	  @Override
	    public String toString()
		{
			return "\nAccount number :"+account_number.replaceFirst("(\\d{2})(\\d{6})(\\d+)", "$1******$3")+
					"\nName :"+name+
					"\nPassword :"+password.replaceAll("^[a-zA-Z0-9_]*$", "***********")+
					"\nPhone :"+phone+
					"\nBalance :"+balance;
		}

	  //equals method overriden to check if account number of the two objects match
	  @Override
	    public boolean equals(Object obj) {
		Account d2 = (Account)obj;
		Account d1 = this;
		if(d1.getAccount_number()==d2.getAccount_number())
		return true;
		else
		return false;
		}
	  
	 

	//Allows user to give input
		void takeAccountDetailsFromUser(Transaction tObj){
			String userChoice = "no";
			
				do {
			System.out.println("Please enter the account number");
			account_number = scanner.next();
			
			if(accountList.contains(account_number)) {
				System.out.println("Account already exists!!");
			}
			else {
			accountList.add(account_number);
			System.out.println("Please enter your name");
			name = scanner.next();
			System.out.println("Please enter your password");		
			password = scanner.next();
			System.out.println("Please enter Phone number");
			phone = scanner.next();
			System.out.println("Please enter the Initial Amount for deposit");
			balance =scanner.nextDouble();
			scanner.nextLine();
		Account acc = new Account();
		acc.setAccount_number(account_number);
		acc.setBalance(balance);
		acc.setName(name);
		acc.setPhone(phone);
		acc.setPassword(password);
		accList.add(acc);
		if(tObj!=null)
		tObj.populateAccounts(acc);
			System.out.println("Account Created");
			}
			System.out.println("Do u want to enter another Account yes/no??");
			userChoice = scanner.nextLine();
			}while( userChoice.equalsIgnoreCase("yes"));
		}
		void printAccountDetails() {
				for(Account acc:accList)	
			System.out.println(acc);
		}
		public static void main(String[] args) {
			Account obj = new Account();
			obj.takeAccountDetailsFromUser(null);
			obj.printAccountDetails(); 
			
		}

}
