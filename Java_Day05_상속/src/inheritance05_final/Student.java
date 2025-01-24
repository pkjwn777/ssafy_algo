package inheritance05_final;

//extends 키워드를 이용하여 상속을 받는다.
public final class Student extends Person {
	String major;

	public Student() {
		super(); // 기본적으로 생략이 되어있음 :부모의 기본생성자를 호출!
//		this("익명", 10, "자유전공"); 같이 사용할 수 없음
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	void study() {
		System.out.println("공부를 한다.");
	}

	//이제는 안된다! (final이 붙은 메서드를 재정의할수는 없음)
//	@Override
//	public void eat() {
//		// 재정의 니가 할수 있는건 내용 고치기 밖에 없다.
//		System.out.println("지식을 먹는다.");
//	}
//	
	
	public void eat(int time) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
