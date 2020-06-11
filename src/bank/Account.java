package bank;
import java.util.Scanner;

public class Account {

	private String name,accnumber;
	private float balance;
	
	Scanner scanner;
	
	
	Account(){
		scanner = new Scanner(System.in);
	}
	
	 Account(String name,float balance){
		scanner = new Scanner(System.in);
		this.name = name;
		this.balance = balance;
	}
	
	 Account(String number,String name, float balance)
	{
		scanner = new Scanner(System.in);
		this.accnumber = number;
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return accnumber;
	}
	public void setNumber(String number) {
		this.accnumber = number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	

	void getAccountDetailsFromUser() {
		
		System.out.println(" enter the Account number");
		accnumber = scanner.nextLine();
		System.out.println("enter the Customer name");
		name = scanner.nextLine();
		System.out.println("enter the Account balance");
		balance = scanner.nextFloat();
	}
	void printAccountDetails() {
		System.out.println("Account no. - "+accnumber);
		System.out.println("Cust name -"+name);
		System.out.println("Acc balance - "+balance);
		System.out.println("------------------------------");
	}
}

