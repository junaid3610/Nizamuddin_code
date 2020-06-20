package day19Assignment;

public class Busmodel extends Driver{

	String busnumber;
	String capacity;
	String filledstatus;
	
	 void BusDetailsFromUser() {
			System.out.println("Please enter the bus number");
			busnumber = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Please enter the seating capacity");
			capacity = scanner.nextLine();
			System.out.println("Status of the seat avalabilty");
			//System.out.println(maskString(phone, 0, 4, '*') );
			filledstatus = scanner.nextLine();
						
		if(filledstatus.contains(capacity)) {
			System.out.println("No Seats Available");
		}
		else {
			System.out.println("Seats are Available");
	

		}
}
	 }