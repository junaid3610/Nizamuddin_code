package day19Assignment;

import java.util.Scanner;

import java.util.ArrayList;

public class Driver {

	private int driverid;
	private String drivername;
	String driverphonenumber;
	String busallocated;
	ArrayList<Integer> driverList;
	Scanner scanner;


 Driver() {
	 scanner = new Scanner(System.in);
	 driverList = new ArrayList<Integer>();
 }
 
 Driver(int driverid,String drivername,String driverphonenumber){
		scanner = new Scanner(System.in);
		this.driverid = driverid;
		this.drivername = drivername;
		this.driverphonenumber = drivername;
		this.busallocated = busallocated;
		}
 
 public int getDriverid() {
	 
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	
	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

 void GetDriverDetailsFromUser() {
		System.out.println("Please enter the driver id");
		driverid = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the driver name");
		drivername = scanner.nextLine();
		System.out.println("Please enter the driver Phonenumber");
		driverphonenumber = scanner.nextLine();
		System.out.println("Enter the allocated bus");
		//System.out.println(maskString(phone, 0, 4, '*') );
        busallocated = scanner.nextLine();
     
			
	}
 @Override
	public String toString() {
			return "Driver ID "+driverid+"\nDriver Name "+drivername+"\nCustomer phone"+driverphonenumber;
	}

	@Override
    public boolean equals(Object obj) {
	Driver d2 = (Driver)obj;
	Driver d1 = this;
	if(d1.getDriverid()==d2.getDriverid())
	return true;
	else
	return false;
	}

}
