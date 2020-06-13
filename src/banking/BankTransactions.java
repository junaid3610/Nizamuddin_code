package banking;

import java.util.ArrayList;
import java.util.Scanner;

public class BankTransactions {
	ArrayList<Account> accDetails;
	Scanner scanner;
	double amt;
	BankTransactions(){
		scanner = new Scanner(System.in);
		accDetails = new ArrayList<Account>();
	}
	
	//Allows user to perform their interested operation
		void userOperation()
		{
			int userChoice = 0;
			String transOpt=null;
			System.out.println("Please select a number \r\n" + 
					"1) Transact\r\n" + 
					"2) Print Account Details\r\n" + 
					"3) Show balance");
			userChoice = scanner.nextInt();
			scanner.nextLine();
			if(userChoice==1) {
				System.out.println("Please enter the type of transaction\r\n" + 
						"1) Withdraw\r\n" + 
						"2) Deposit");
				transOpt =scanner.next();
				scanner.nextLine();
			}
			System.out.println("Please enter the account number");
			int accNo=scanner.nextInt();
			scanner.nextLine();
			Account obj = findAccount(accNo);
			if(obj!= null) {
			switch(userChoice) {
			case 1: System.out.println("Please enter the amount");
			amt=scanner.nextDouble();
			scanner.nextLine();
			if(obj.getAccType().equalsIgnoreCase("savings"))
			{
			new SavingsAccount().transact(obj, transOpt, amt);
			}
			else if(obj.getAccType().equalsIgnoreCase("savings"))
			{
			new CurrentAccount().transact(obj, transOpt, amt);
			}
			break;
			case 2: 
				
				System.out.println(obj.getAccType()+
						"\r\nAccount Number : "+accNo+
						"\r\nName : "+obj.getName()+
						"XYZ\r\nAge : 31\r\n" + 
						"Phone : "+obj.getPhone()+
						"\r\nBalance : "+obj.getBalance());
			case 3 : 
			System.out.println("The available balance is "+obj.checkBalance());	
				break;
			}
			}
		}
	//adds all accounts created to ArrayList accDetails	
	void populateAccounts(int accountNumber, String accType, String name, String dob, String phone, double balance)
	{
		Account obj = new SavingsAccount();
		obj.setAccountNumber(accountNumber);
		obj.setAccType(accType);
		obj.setBalance(balance);
		obj.setName(name);
		obj.setDob(dob);
		obj.setPhone(phone);
		accDetails.add(obj);
		
	}
	//gets accNo as input and returns the relevant account object
	Account findAccount(int accNo) {
		
		for(Account obj:accDetails){
			if(obj.getAccountNumber() == accNo)
				return obj;
		}
		System.out.println("Account does not exist");
		return null;
	}
	public static void main(String[] a) {
		Account sObj = new SavingsAccount();
		sObj.takeAccountDetails();
		
		
	}
}
