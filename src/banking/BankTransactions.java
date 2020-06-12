package banking;

import java.util.Scanner;

public class BankTransactions {
	String type;
	int transact;
	Scanner scanner;
	BankTransactions(){
		scanner = new Scanner(System.in);
	}
	void transaction()
	{
		System.out.println("Please select a number \r\n" + 
				"1) Transact\r\n" + 
				"2) Print Account Details\r\n" + 
				"3) Show balance");
		transact = scanner.nextInt();
		scanner.nextLine();
	}
	public static void main(String[] a) {
		Account sObj = new SavingsAccount();
		Account cObj = new CurrentAccount();
		sObj.takeAccountDetails();
		cObj.takeAccountDetails();
		
		if(sObj.getAccType().equalsIgnoreCase("Savings"))
		{
			//sObj.transact(another, type, amount)
		}
		else if(sObj.getAccType().equalsIgnoreCase("Current"))
		{
			
		}
	}
}
