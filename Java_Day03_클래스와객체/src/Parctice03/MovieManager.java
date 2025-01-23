package Parctice03;

public class MovieManager {
	private Movie[] movieList = new Movie[100];
	private int size = 0;
	private int MAX_SIZE = 100;
	
	public void add(Movie movie) {
		if(this.size < MAX_SIZE) {
			movieList[this.size] = movie;
			size++;
			return;
		}
		else return;
	}
	
	public Movie[] getList() {
		Movie[] result = new Movie[size];
		for(int i = 0; i < size; i++) {
			result[i] = movieList[i];
		}
		return result;
	}
	
	public Movie searchByTitle(String title) {
		
		Movie result = new Movie();
		for(int i = 0; i < this.size; i++) {
			if(movieList[i].getTitle().equals(title)) {
				result = movieList[i];
				break;
			}
		}
		return result;
	}
}
