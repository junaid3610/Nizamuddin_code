package banking;

public class CurrentAccount extends Account {
	//override to perform
	@Override
	boolean transact(Account another,String type,double amount) {
			return true;
	}
}
