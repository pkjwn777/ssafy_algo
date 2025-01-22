
public class Java06_반복문2 {
	public static void main(String[] args) {
		// while(조건식) { 반복내용}
		// 조건식 생략 불가능
		
		int i = 0;
		
		while(i < 5) {
			System.out.println(i++);
//			++i;
		}
		System.out.println(i);
		
		//while 문 두개 써도 되지만... 한개로도 구구단 가능할것 같다...
	}
}
