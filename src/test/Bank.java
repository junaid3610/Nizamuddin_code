package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	ArrayList<Account>accountList;
	ArrayList<Transaction>transactionList;
	Scanner scanner;
	
	Bank(){
		accountList = new ArrayList<Account>();
		transactionList = new ArrayList<Transaction>();
		scanner = new Scanner(System.in);
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	public void setTransactionList(ArrayList<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	void addAccounts(Account aObj, Transaction tObj) {
		
		aObj.takeAccountDetailsFromUser(tObj);
		setAccountList(tObj.getAccountList());
		System.out.println("Accounts added successfully");
	}
	void doTransaction(Transaction tObj, Bank bObj)
	{
		tObj.transact(bObj);
		System.out.println("Transaction completed successfully");
	}
	void populateAccounts(Transaction tObj){
		transactionList.add(tObj);
	}
	void printAccounts() {
		for(Account acc:accountList) {
			System.out.println(acc);
		}
	}
	void printTransactions() {
		for(Transaction trans:transactionList) {
			System.out.println(trans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bObj = new Bank();
		Account aObj = new Account();
		Transaction tObj = new Transaction();
		bObj.addAccounts(aObj, tObj);
		bObj.doTransaction(tObj, bObj);
		bObj.printAccounts();
		bObj.printTransactions(); 
	}

}
