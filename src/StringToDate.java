import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {
	String dob;
	
	
	StringToDate(){
		
	}
	String ageCalculation(String dob) {
		String age = null;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dobFormatted = LocalDate.parse(dob, dtf);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(dobFormatted, now);
		age = diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days";
		return age;
	}
	public static void main(String[] args) {
		System.out.println("Please enter Date of Birth");
		Scanner scanner = new Scanner(System.in);
		String temp= scanner.nextLine();
		StringToDate obj = new StringToDate();
		System.out.println(obj.ageCalculation(temp));
		  
	}

}
