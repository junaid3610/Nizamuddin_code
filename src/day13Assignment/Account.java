package day13Assignment;

import java.util.ArrayList;

public class Account{

	ArrayList<String> myStringArray;
	ArrayList<Double> myDoubleArray;
	
	Account(){
		myStringArray = new ArrayList<String>();
		myDoubleArray = new ArrayList<Double>();
		
	}
	
	void addMembers() {
		
		myStringArray.add((String)"Customer Name: nizam");
		myStringArray.add((String)"Account Number : 40095049");
		myStringArray.add((String)"Phone Number : 904945409");
		myDoubleArray.add((double)200.20);
	
	}
	
	void printCollection() {
		
	
	for (String mynum1 : myStringArray) {
	System.out.println(mynum1);
	}
	for (Double mynum : myDoubleArray) {
		System.out.println("Amount :" +mynum);
	
	}
	}
	
	public static void main(String[] args) {
		Account obj= new Account();
		obj.addMembers();
		obj.printCollection();
	
	}

}
