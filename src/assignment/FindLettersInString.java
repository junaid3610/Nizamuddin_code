package assignment;
import java.util.Scanner;

public class FindLettersInString {
		
	private String a,b,str, outputStr;
	Scanner sc;

	FindLettersInString(){
		sc = new Scanner (System.in);
		
	}
	
	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getStr() {
		return str;
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
				if(outputStr != null)
					outputStr = outputStr+a;
				else
					outputStr = a;
			}else if ( b.equalsIgnoreCase(str.substring(i, i+1))){
				if(outputStr != null)
				outputStr = outputStr+b;
				else
					outputStr = b;
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
