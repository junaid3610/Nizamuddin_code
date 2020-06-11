package assignment;

import java.util.Scanner;

public class NonRepeatNumbers {
	
	int[] no;
	Scanner scanner;
	
	NonRepeatNumbers() {
		no = new int[10];
		scanner = new Scanner(System.in);
	}
	
	void getNumbersFromUser() {
	
	System.out.println("Enter only ten numbers");
	for(int i=0;i<=9;i++)
		no[i]=scanner.nextInt();
	}
	boolean checkIfRepeated(int n, int i) {
		boolean flag=true;														
			for(int j=0; j<10; j++)
			{
							
				if(i!=j && n==no[j])
				{
					flag = false;
					break;
				}
			}			
		return flag;
	}
	
	void checkNosForRepetition() {
		getNumbersFromUser();
		System.out.println(" The Non-repeated numbers are ");
		for (int i = 0; i<=9; i++) {
			if(checkIfRepeated(no[i], i)==true)
			{
				System.out.print("\n "+no[i]);
			}
		}
	}
	public static void main(String[] args) {
		NonRepeatNumbers obj = new NonRepeatNumbers();
		obj.checkNosForRepetition() ;
	}
	

}
