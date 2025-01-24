package inheritance04_overriding;

public class Person {
	String name;
	protected int age;
	
	public Person() {
		super(); 	//Object 기본 생성자를 호출
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
