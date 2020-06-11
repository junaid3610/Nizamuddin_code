import java.util.Scanner;
public class SumOfTenNumbers {
	Scanner Scanner;
	
	public SumOfTenNumbers() {
		Scanner = new Scanner(System.in);
	}
	
	void getNumbersFromUserAndSum() {
		int num =0, sum =0;
		for(int i=0; i< 3; i++) {
			System.out.println("user enter the  no.");
			num=Scanner.nextInt();
		sum= sum+num;
	
		}
	
	
	System.out.println("the num is... "+sum);
	}
	public static void main(String[] args) {		
		new SumOfTenNumbers().getNumbersFromUserAndSum();
	}
		

	}

  
