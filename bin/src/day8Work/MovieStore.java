package day8Work;

public class MovieStore {
	private static MovieStore movieStore;

	
	Movie[] movies;
	MovieStore(){
		movies=new Movie[3];
		
	}
	void addMovie(int i) {
		//for( int i=0;i<movies.length;i++) {
			movies[i]= new Movie();
		movies[i].getMovieDetailsFromUser();
	//}

}
	void listAllMovies(int i) {
		//for (int i=0; i <  movies.length; i++) {
			movies[i].printMovieDetails();
	//}
	}
	
	public static void main(String []args) {
		MovieStore.movieStore = new MovieStore();
		movieStore.addMovie(0);
		movieStore.listAllMovies(0);
		
	}
}
  