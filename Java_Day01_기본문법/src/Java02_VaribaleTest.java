
public class Java02_VaribaleTest {
	public static void main(String[] args) {
		// 작명규칙
		// 변수 작명규칙
		// - 대소문자를 구분한다
		// - 공백은 허용되지 않는다
		// - 숫자로 시작할 수 없다.
		// - '$'와 '_'를 변수 이름에 사용할 수 있다. 이외의 특수문자는 허용되지 않는다.
		// - 예약어(keyword : 자바 문법을 위해서 미리 지정되어 있는 단어)는 사용할 수 없다.
		// - 합성어의 경우 주로 camelCase를 활용한다.
		// - 한글을 이용한 변수 작명 가능(권장 X)

		int age;
		int Age;

		int age123;
//		int 123age;  숫자로 시작할 수는 없다.

		int 나이; // 권장하진 않아

		int age_123;

		int $age;

		int a = 100;

		System.out.println(a);

		int b;
//		System.out.println(b); //지역변수는 초기화 해야쓸수 있음

	}
}
