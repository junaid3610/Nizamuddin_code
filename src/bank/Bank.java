package bank;


public class Bank {

	Account[] acc;

    Bank(){
	 
	   acc = new Account[2];

	}
   
   void addAccount() {
	   
		for (int i = 0; i < acc.length; i++) {
		
			acc[i] = new Account();
			acc[i].getAccountDetailsFromUser();
		}
	}
	
	void printDetails() {
		for (int i = 0; i < acc.length; i++) {
			acc[i].printAccountDetails();
		}
	}
	

	public static void main(String[] args) {
	

		Bank bank = new Bank();
	
		bank.addAccount();
		bank.printDetails();

	}

}
