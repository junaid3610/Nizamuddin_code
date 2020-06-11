package card;


import bank.Pan;
import bank.*;
import bank.Customer;



public class DebitCard {
	
	Pan pan;
	DebitCard(){
		pan= new Pan();
	pan.setPanNumber("asasads999");
		pan.printPanDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}