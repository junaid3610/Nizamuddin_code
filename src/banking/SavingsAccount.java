package banking;

public class SavingsAccount extends Account {
	//construtor to perform
	SavingsAccount(){
		
	}
	//override to perform
	@Override
	boolean transact(Account another,String type,double amount) {
		if(type.equalsIgnoreCase("1"))
		{
			if((another.checkBalance()-amount)>5000.00) {
				another.setBalance(another.checkBalance()-amount);
							}
			else{
				System.out.println("Withdraw not possible. Insuff. Balance");
			}
		}
		else if(type.equalsIgnoreCase("2"))
		{
			another.setBalance(amount+another.checkBalance());
			System.out.println(another.checkBalance());

		}else
			System.out.println("Incorrect choice");
		
			return true;
			
	}
	
}
