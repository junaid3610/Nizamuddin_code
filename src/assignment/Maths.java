package assignment;

import java.util.Scanner;


public class Maths {

	Scanner sc;
	private int num1,num2,abc,mul,add,sub;
	private double div;
	
	Maths(){
	sc = new Scanner(System.in);
	
}
	
 Maths(int num1,int num2,int opt,int add,int sub){
	sc = new Scanner(System.in);	
 }
 
	
	
	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getabc() {
		return abc;
	}

	public void setabc(int abc) {
		this.abc = abc;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public double getDiv() {
		return div;
	}

	public void setDiv(double div) {
		this.div = div;
	}

	     
	void getNumberFromUser() {
	System.out.println("Please enter the first number");
    num1=sc.nextInt();
	sc.nextLine();
	System.out.println("Please enter the second number");
	num2=sc.nextInt();
	sc.nextLine();
		
	while(true)
	{
	System.out.println("Pleasr Enter 1 for addition");
	System.out.println("Pleasr Enter 2 for subtraction");
	System.out.println("Pleasr Enter 3 for Multiplication");
	System.out.println("Pleasr Enter 4 for Division");
	System.out.println("Pleasr Enter 5 for Exit");
	abc= sc.nextInt();
		
	switch(abc)
	{
	case 1:
		add = num1 + num2;
		System.out.println("Result= "+add);
		break;
		
	case 2:
		sub = num1 - num2;
		System.out.println("Result= "+sub);
		break;
	case 3:
		mul = num1 * num2;
		System.out.println("Result= "+mul);
		break;
	case 4:
		div =(double) num1/num2;
		System.out.println("Result= "+div);
		break;
		case 5:
			Maths sce = new Maths();
System.out.println("------------EXIT---------------");
		System.exit(0);
		
	}
	}
	}

		public static void main(String[] args) {
			Maths  sce =  new Maths();
			sce.getNumberFromUser();
	}
}
