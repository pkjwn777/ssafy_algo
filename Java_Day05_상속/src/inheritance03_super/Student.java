package inheritance03_super;


//extends 키워드를 이용하여 상속을 받는다.
public class Student extends Person {
	String major;
	
	public Student() {
		super(); //기본적으로 생략이 되어있음 :부모의 기본생성자를 호출!
//		this("익명", 10, "자유전공"); 같이 사용할 수 없음
	}
	
	
	


//	public Student(String name, int age, String major) {
//		super();
//		this.name = name;
//		this.age =  age;
//		this.major = major;
//	}
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	void study() {
		System.out.println("공부를 한다.");
	}
	
	
	
	
	
	
	
	
	
}
