package Parctice03;

public class RestaurantTest {
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant();
		
		r1.resid = 101;
		r1.name = "을밀대";
		r1.address = "서울";
		r1.signatureMenu = "냉면";
		r1.rate = 4;
		
		Restaurant r2 = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		
		Review v1 = new Review();
		v1.reviewid = 1;
		v1.resid = 101;
		v1.writer = "김싸피";
		v1.content = "너무 앗있네요.";
		
		Review v2 = new Review(2, 401, "나싸피", "연어초밥은 여기가 최고!");
		
		System.out.println("******************************맛집목록******************************");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println("******************************리뷰목록******************************");
		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}
}
