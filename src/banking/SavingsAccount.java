package banking;

public class SavingsAccount extends Account {
	SavingsAccount(){
		
	}
	@Override
	boolean transact(Account another,String type,double amount) {
			return true;
	}
	
}
