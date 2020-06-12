package banking;

public class CurrentAccount extends Account {
	@Override
	boolean transact(Account another,String type,double amount) {
			return true;
	}
}
