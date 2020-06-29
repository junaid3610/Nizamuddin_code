package test;


import java.util.ArrayList;
import java.util.Scanner;

public class Transaction{
	private int transaction_number;
	Account fromAccount, toAccount;
	double amount;
	String type, status = "incomplete";
	Scanner scanner;
	ArrayList<Account> accountList;
	public Account getToAccount() {
		return toAccount;
	}


	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}


	Transaction(){
		scanner = new Scanner(System.in);
		accountList = new ArrayList<Account>();
	}
	
	
	//toString method overriden to return the details of a transaction when called with the object
	  @Override
	    public String toString()
		{
		  String toAcc = "";
		  if(toAccount!=null)
		 			  toAcc = "\nTo Account :"+toAccount.getAccount_number().replaceFirst("(\\d{2})(\\d{6})(\\d+)", "$1******$3");
		  
			return "\nTransaction number :"+transaction_number+
					"\nFrom Account :"+fromAccount.getAccount_number().replaceFirst("(\\d{2})(\\d{6})(\\d+)", "$1******$3")+
					toAcc+
					"\nType :"+type+
					"\nAmount :"+amount+
					"\nStatus :"+status;
		}
	 void transact(Bank bObj) {
		 
	 String userChoice = "no";
		 do {
		 System.out.println("Enter the transaction number");
		 transaction_number = scanner.nextInt();
		 scanner.nextLine();
		 System.out.println("Enter the type of transfer...Cash/Transfer?");
		 type = scanner.next();
		 System.out.println("Enter the amount ");
		 amount=scanner.nextDouble();
		 scanner.nextLine();
		 System.out.println("Enter the From Account number");
		 String from = scanner.next();
		 Account fromAcc = findAccountByNo(from);		 
		 Account toAcc = null;
		if( checkMinBal(fromAcc, amount)) {
		 if(type.equalsIgnoreCase("cash")) {
			 fromAcc.setBalance(fromAcc.getBalance()-amount);
			 System.out.println("Amount debited successfully from "+from.replaceAll("\\d(?=\\d{2})", "*"));
			 System.out.println("The remaining balance is "+fromAcc.getBalance());
			 
		 }else if(type.equalsIgnoreCase("transfer")) {

			 System.out.println("Enter the To Account");
			 String to = scanner.next();
			 toAcc = findAccountByNo(to);
			 fromAcc.setBalance(fromAcc.getBalance()-amount);
			 toAcc.setBalance(toAcc.getBalance()+amount);
			 System.out.println("Amount debited from "+from.replaceAll("\\d(?=\\d{2})", "*"));
			 System.out.println("The remaining balance is "+fromAcc.getBalance());
			 System.out.println("Amount credited to "+to.replaceAll("\\d(?=\\d{2})", "*"));
			 System.out.println("The remaining balance is "+toAcc.getBalance());
		 }
		 status = "complete";
		 System.out.println("Transaction completed successfully");
		 
		}
		Transaction tObj = new Transaction();
		 tObj.setFromAccount(fromAcc);
		 tObj.setTransaction_number(transaction_number);
		 tObj.setAmount(amount);
		 tObj.setToAccount(toAcc);
		 tObj.setStatus(status);
		 tObj.setType(type);
		 if(bObj!=null)
		 bObj.populateAccounts(tObj);
		 System.out.println("Do u want to do another transaction...yes/no??");
			userChoice = scanner.next();
		 }while(userChoice.equalsIgnoreCase("yes"));
	 }
	 public void setTransaction_number(int transaction_number) {
		this.transaction_number = transaction_number;
	}


	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}


	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public ArrayList<Account> getAccountList() {
		return accountList;
	}


	boolean checkMinBal(Account from, double amt){
		 if(from.getBalance()>amt)
			 return true;
		 System.out.println("Insufficient balance!!!");
		 return false;
	 }
	Account findAccountByNo(String no){
		 boolean accExists = false;
		 do {
			 
		 for(Account acc:accountList) {
			 if(acc.getAccount_number().equalsIgnoreCase(no)) {
				 accExists = true; 
				 return acc;
			 }
		 }
		 }while(accExists = false);
		return null;
	} 
	void populateAccounts(Account obj){
		accountList.add(obj);
	}
	 
	 public static void main(String[] args) {
		 	Transaction obj = new Transaction();
			Account from = new Account();
			from.takeAccountDetailsFromUser(obj);
			obj.transact(null); 
		}

}
