
public class Java05_조건문1 {
	public static void main(String[] args) {
		// if(조건식) { } 조건식이 참일 경우 블록 내부 수행
		// 조건식: boolean 형태의 값을 봔환하는 식이나, boolean 값이 들어감
		// 수행할 문장이 한 문장이라면 중괄호 생략 가능
		int age = 10;
		
		//나이가 10살 이상이면 출력해라 (권장)
		if(age >= 10) {
			System.out.println("10살 이상입니다.");
		}
		
		if(age >= 10) 
			System.out.println("10살 이상입니다.");
		
	}
}
