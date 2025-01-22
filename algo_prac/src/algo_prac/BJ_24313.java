package algo_prac;
import java.util.Scanner;
public class BJ_24313 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++; j--;
			}
			else {
				System.out.println(0);
				System.exit(0);
			}
		}
		System.out.println(1);
	}
}