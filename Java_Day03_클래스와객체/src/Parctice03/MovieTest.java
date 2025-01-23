package Parctice03;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		
		m1.setId(1);
		m1.setTitle("박쥐");
		m1.setDirector("박찬욱");
		m1.setGenre("스릴러");
		m1.setRunnigTime(210);
		
		Movie m2 = new Movie(2, "괴물", "봉준호", "미스터리", 180);
		
		System.out.println(m1);
		System.out.println(m2);
		
		MovieManager movieList = new MovieManager();
		
		movieList.add(m1);
		movieList.add(m2);
		
		System.out.println(movieList.getList()[0]);
		System.out.println(movieList.getList()[1]);
		
		System.out.println(movieList.searchByTitle("괴물"));
	}
	
}
