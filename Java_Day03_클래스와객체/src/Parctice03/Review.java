package Parctice03;

public class Review {
	int reviewid;
	int resid;
	String writer;
	String content;
	
	public Review() {}
	
	public Review(int reviewid, int resid, String writer, String content) {
		this.reviewid = reviewid;
		this.resid = resid;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		String info ="Review [reviewId="+reviewid+", resId="+resid+", writer="+writer+", content="+content+"]";
		return info;
	}
}
