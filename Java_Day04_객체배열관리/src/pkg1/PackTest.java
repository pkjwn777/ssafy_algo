package pkg1;


public class PackTest {
	public static void main(String[] args) {
		Pack p = new Pack();
		
		pkg1.pkg2.Pack p2 = new pkg1.pkg2.Pack();
		System.out.println(p.pkg);
		System.out.println(p2.pkg);
		
		
	}
}
