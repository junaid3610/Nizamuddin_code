package assignment;
import java.util.Scanner;


public class PrimeTenNumbers {
		
		int[] no;
		Scanner scanner;
		
		PrimeTenNumbers() {
			no = new int[10];
			scanner = new Scanner(System.in);
		}
		
		void getNumbersFromUser() {
		
		System.out.println("Enter only ten numbers");
		for(int i=0;i<=9;i++)
		{
			no[i]=scanner.nextInt();
		}
		
			
		}
		boolean CheckIfPrimeOrNot(int num) {
			boolean result = true;
			for (int i = 2; i < num-1; i++) {
				if(num%i == 0)
				{
					result = false;
					break;
				}
			}
			return result;
		}
		
		void checkRangeForPrime() {
			getNumbersFromUser();
			System.out.println(" The Prime numbers are ");
			for (int i = 0; i<=9; i++) {
				if(CheckIfPrimeOrNot(no[i])==true)
				{
					System.out.print("\n "+no[i]);
				}
			}
		}
		public static void main(String[] args) {
			PrimeTenNumbers primeInRange = new PrimeTenNumbers();
			primeInRange.checkRangeForPrime() ;
		}

	

}
