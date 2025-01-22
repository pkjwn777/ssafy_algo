package Parctice03;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		
		m1.id = 1;
		m1.title = "박쥐";
		m1.director = "박찬욱";
		m1.genre = "스릴러";
		m1.runningTime = 210;
		
		Movie m2 = new Movie(2, "봉준호", "괴물", "미스터리", 180);
		
		movie_info(m1);
		movie_info(m2);
	}
	
	//각각의 영화에 대한 인스턴스 변수에 접근하려고 한다. 그러면 클래스 내에 해당 메소드를 선언할 때, static은 작성하면 안된다?
	public static void movie_info(Movie movie) {
		System.out.printf("id : %d\n제목 : %s\n감독 : %s\n장르 : %s\n상영 시간 : %d\n", movie.id, movie.title, movie.director, movie.genre, movie.runningTime);
	}

}
