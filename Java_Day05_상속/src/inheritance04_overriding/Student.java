package inheritance04_overriding;


//extends 키워드를 이용하여 상속을 받는다.
public class Student extends Person {
	String major;
	
	public Student() {
		super(); //기본적으로 생략이 되어있음 :부모의 기본생성자를 호출!
//		this("익명", 10, "자유전공"); 같이 사용할 수 없음
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	void study() {
		System.out.println("공부를 한다.");
	}
	
	//메서드 오버라이딩
	//해당 어노테이션을 넣음으로써 조금더 명확하게 
	//상속 관계에서 사용할 수 있음
	//부모클래스에 정의된 메서드와 동일 해야함. (메서드이름, 매개변수, 반환타입)
	@Override 
	public void eat() {
		//재정의 니가 할수 있는건 내용 고치기 밖에 없다.
		System.out.println("지식을 먹는다.");
	}
	
	
	//메서드 오버로딩
	//메서드 명 동일하고,  매개변수 순서나 개수가 다른것
	//반환타입만 다른거 노인정
	public void eat(int time) {
		System.out.println(time + "시간 만큼 지식을 먹었씁니다.");
	}
	
	
	public String info() {
		return name+":"+age;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
