package assignment;
import java.util.Scanner;

public class FindLettersInString {
		
	private String a,b,str, outputStr;
	Scanner sc;

	FindLettersInString(){
		sc = new Scanner (System.in);
		
	}
	

	void getInputs() {
		System.out.println("Enter the string  ");
		str = sc.nextLine();
		System.out.println("Enter the First Alphabet ");
		a = sc.next();
		System.out.println("Enter the Second Alphabet ");
		b = sc.next();
	}

	void checkLogic() {
		for (int i=0; i<str.length(); i++)
		{
			if ( a.equalsIgnoreCase(str.substring(i, i+1))){
				if(outputStr != null && !(outputStr.contains(a)))
					outputStr = outputStr+a;
				else
				{
					//if(!(outputStr.contains(a)))
					outputStr = a;
				}
			}else if ( b.equalsIgnoreCase(str.substring(i, i+1))){
				if(outputStr != null && !(outputStr.contains(b)))
				outputStr = outputStr+b;
				else
				{
					//if(!(outputStr.contains(b)))
					outputStr = b;
				}
			}
		}
		
		
	}
	void printOutput() {
		if(outputStr != null) {
		switch(outputStr.length())
		{
		case 1: System.out.println("Only one alphabet present ");
		System.out.println("First "+outputStr.charAt(0));
		break;
		case 2: System.out.println("Alphabets present");
		System.out.println("First "+outputStr.charAt(0)+" then "+outputStr.charAt(1));
		break;
		default:
			System.out.println("Too many letters entered");
		}
		}
		else
			System.out.println("Sorry the alphabets are not present in the string");
			
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLettersInString obj = new FindLettersInString();
		obj.getInputs(); //sets values for a, b and str
		obj.checkLogic();
		obj.printOutput();
		

	}

}
