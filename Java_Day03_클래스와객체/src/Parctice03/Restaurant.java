package Parctice03;

public class Restaurant {
	
	int resid;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	public Restaurant() {}
	
	public Restaurant(int resid, String name, String address, String signatureMenu, int rate) {
		this.resid = resid;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	public String toString() {
		String info = "Restaurant [resId="+resid+", name="+name+", address="+address+", signatureMenu="+signatureMenu+", rate="+rate+"]";
		return info;
	}

}
