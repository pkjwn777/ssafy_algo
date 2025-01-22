package Parctice03;

public class BookTest {
	public static void main(String[] args) {
		// 코드를 작성하세요.
		Book b1 = new Book();
		b1.isbn = "21424";
		b1.title = "Java Pro";
		b1.author = "김하나";
		b1.publisher = "jean.kr";
		b1.price = 15000;
		b1.desc = "Java 기본 문법";


		Book b2 = new Book("35355", "분석설계", "소나무", "jean.kr", 30000, "SW 모델링");

		System.out.println("**********************도서목록**********************");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}
