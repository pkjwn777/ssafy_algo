package inheritance02_ok;



public class Test{
	public static void main(String[] args) {
		Person p = new Person(); //기본생성자가 있어서...
		
		Student st = new Student();
		
		
		//서로 연관이 있음
		p.eat();
		
//		st.
		
		st.eat();
	}
}
