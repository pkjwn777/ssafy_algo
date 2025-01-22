
public class Java04_Operator {
	public static void main(String[] args) {
		// 산술연산자 : 수학적인 연산
		int a = 35;
//		int b = 10;
		double b = 10;

//		+, -, *, /, %
//		System.out.println(a/b);
		// 정수와정수를 연산 -> 정수
		// 정수와실수를 연산 -> 실수

		// 비교연산자 : 결과가 true/ false 값으로 나온다.
		int c = 100;
		int d = 1000;
//		
//		System.out.println(c == d);
//		System.out.println(c != d);
//		System.out.println(c > d);

		String e = "Java";
		String f = "Python";
		String g = "Java";

//		System.out.println(e == f); //f
//		System.out.println(e == g); //t
//		
//		System.out.println(e.equals(f)); //f
//		System.out.println(e.equals(g)); //t

		// 논리연산자 : 해당 결과들고 t/f 형태로

		// && : 둘 다 참 -> 참
		// || : 적어도 하나 참 -> 참
		// ! : 결과를 반대로

		// 단락평가/단축평가 -> 앞의조건을 보고 뒤에 확인 할지말지 결정함
		// t && t
		// t && f
		// f && t
		// f && f

		// t || t
		// t || f
		// f || t
		// f || f

		// 대입 복합 연산자
		int h = 10;
		
		h = h + 10;   
		//컴퓨터 쟁이들은 중복되게 쓰는걸 싫어해!
		h += 10; // h = 10 + h 이게 아니야!
		
		// 단항 연산자(증감)
		
		int i = 0;
		
		System.out.println(++i); //?
		System.out.println(i++); //?
		
		System.out.println(++i);
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i);
		
		
		

	}
}
