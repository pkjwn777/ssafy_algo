package modifier04_protected2;

import modifier04_protected.Person;

public class PersonTest extends Person {
	public static void main(String[] args) {
		Person p = new Person();
		//p. 이거는 다른패키지라서 당연히 안됨
		
		//상속을 받은 뒤 해당 객체를 통해서 접근이 가능하다.
		PersonTest pt = new PersonTest();
		pt.age = 100;
		
	}
}
