/*
public class Movie {

	int id;
	String  moviename,duration, actorname;
	
	Movie(){
		id=345;
		moviename="spiderman";
		duration="180mins";
		actorname="vadivelu";			
	}
	
	Movie(int y, String z, String x, String c){
		id =y;
		moviename=z;
		duration=x;
		actorname=c;
	}

public static void main(String[] args) {
	
	Movie m1= new Movie(); 
	Movie m2= new Movie(333,"badboys","120mins","Arnold");

System.out.println("Mov Id is "+ m1.id);
System.out.println("MovName is "+ m1.moviename);
System.out.println("duration is  ="+ m1.duration);
System.out.println("actorname is "+ m1.actorname);


System.out.println("Mov Id is "+ m2.id);
System.out.println("MovName is "+ m2.moviename);
System.out.println("duration is  ="+ m2.duration);
System.out.println("actorname is "+ m2.actorname);

}
}
*/

/*
public class Movie {

int id = 101;
String Moviename = "SpiderMan";
   String Actorname = "Arnold";    

void playMovie()
{
System.out.println("Playing movie without error");
}
void printMovieDetails() {
System.out.println("Movie Id : "+id);
System.out.println("Name : "+Moviename);
System.out.println("actor: "+ Actorname);

}
public static void main(String[] args) {
Movie m1 = new Movie();
m1.playMovie();
m1.printMovieDetails();
}
}
*/



public class Movie {

	int id;
	String  moviename,duration, actorname;
	
	Movie(){
		id=345;
		moviename="spiderman";
		duration="180mins";
		actorname="vadivelu";			
	}
	

public static void main(String[] args) {
	
	Movie m1= new Movie(); 

System.out.println("Mov Id is "+ m1.id);
System.out.println("MovName is "+ m1.moviename);
System.out.println("duration is  ="+ m1.duration);
System.out.println("actorname is "+ m1.actorname);


}
}