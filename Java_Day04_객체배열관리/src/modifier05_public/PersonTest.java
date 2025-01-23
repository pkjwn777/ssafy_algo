package modifier05_public;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.age = 100;  //public : 같은 패키지면 접근이 가능하다.
		p.info();
	}
}
