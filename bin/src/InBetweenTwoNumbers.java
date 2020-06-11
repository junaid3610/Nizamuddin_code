import java.util.Scanner;
public class InBetweenTwoNumbers {

int min,max;
	
	Scanner sc;
	
	InBetweenTwoNumbers()
	{
		
		sc = new Scanner(System.in);
	}
	
	void findInBetweenTwoNumbers()
	{ 
		
     if(min == max)
			
	 System.out.println("Invalid number");
	

		else 
			for(int i=min+1;i<max;i++)
			{
			System.out.println(i);
		
			}
     
	}
	
	void takeNumberInput()
	{
		
		System.out.println("Please enter minimum number");
		
		min =sc.nextInt();
		

		System.out.println("Please enter maximum number");
		
		max =sc.nextInt();

	}
	
	public static void main(String[] args) {
		
		InBetweenTwoNumbers btwn= new InBetweenTwoNumbers();
		btwn.takeNumberInput();
		btwn.findInBetweenTwoNumbers();

	}

}


