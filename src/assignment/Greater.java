package assignment;

import java.util.Scanner;

public class Greater {

	private int n1,n2,n3;
	
     Scanner scanner;
	
	Greater(){
		scanner  = new Scanner(System.in);
	}
	
	Greater(int n1,int n2,int n3) {
		scanner = new Scanner(System.in);
		this.n1 = n1;
		this.n2 =n2;
		this.n3 = n3;
		}
	
	

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}
	
	void getNumberFromUser() {
		System.out.println("enter the First Number");
		n1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter the Second Number");
		n2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter the Thrid Number");
		n3 = scanner.nextInt();
		
	}
	
	void printAccountDetails() {
		System.out.println("First Number"+n1);
		System.out.println("Second Number"+n2);
		System.out.println("Third Number"+n3);
		System.out.println("==============================");
						
}
	
	void getGreaterNumber() {
		if (n1>n2&&n1>n3)
			System.out.println("1st Number is greater");
		else if(n2>n1&&n2>n3)
			System.out.println("2nd Number is Greater");
		else if(n3>n1&&n3>n2)
			System.out.println("3rd Number is Greater");
		else
			System.out.println("Enter the Valid NUmber");
				
	}
	
	
	public static void main(String[] args) {
		Greater grt =new Greater();
		grt.getNumberFromUser();
		grt.printAccountDetails();
		grt.getGreaterNumber();
	}

}
