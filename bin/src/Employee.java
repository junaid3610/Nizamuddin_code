
public class Employee {

	int id,age;
	String name;
	
	Employee(){
		id=101;
		name="Ramu";
		age = 16;
	}
	
	boolean employeeAgeCheck() {
		boolean result= false;
		if (age >=18)
		{
			System.out.println("you can join");

		result =true;
		}
		else 
			System.out.println("you are under age for emp");
		return result;
	}
	
	void printEmployeeData() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("-----------");
	}
	//compile	
	public static void main(String[] args) {
		Employee e1 = new Employee();
	//	boolean checkResult =e1.employeeAgeCheck();
		//if (checkResult==true);
		//Employee e2 = new Employee(102,"Somu",31);
		
		if (e1.employeeAgeCheck()==true)
			e1.printEmployeeData();
		//e2.printEmployeeData();

		
	}

}
