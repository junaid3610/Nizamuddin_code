package day8Work;
import java.util.Scanner;

public class Movie {
	
	private int id ;
	private String name;
	private float duration;

	 Scanner scanner ;
	

	Movie(){
	scanner = new Scanner(System.in);
}

	Movie(String name,float duration){
	scanner =new Scanner(System.in);
	this.name =name;
	this.duration= duration;
	
}

	Movie(int id,String name,float duration){
	scanner =new Scanner(System.in);
	this.id =id;
	this.duration= duration;
	
}
public void setName(String name) {
	this.name =name;

}
public float getDuration() {
	return duration;
	
}
public void setDuration(float duration) {
	this.duration =duration;
	
}
void getMovieDetailsFromUser() {
	System.out.println("Please enter movie id");
	id= scanner.nextInt();
	scanner.nextLine();
	System.out.println("pls enter movie name");
	name=scanner.nextLine();
	System.out.println("pls enter the mov duration");
	duration = scanner.nextFloat();
	
}
void printMovieDetails() {
	System.out.println("movi id "+id+"\n movie name "+name+ "\n duaration " +duration );
	System.out.println("------------------------------");
}
}
