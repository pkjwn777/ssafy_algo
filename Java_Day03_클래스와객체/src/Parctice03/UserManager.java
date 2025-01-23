package Parctice03;

public class UserManager {
	
	private int size = 0;
	private final int MAX_SIZE = 100;
	private User[] userList = new User[MAX_SIZE];
	
	public void add(User user) {
		if(size < MAX_SIZE) {
			userList[size] = user;
			size++;
		}else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public User[] getList() {	
		User[] result = new User[this.size];
		for(int i = 0; i < this.size; i++) {
			result[i] = userList[i];
		}
		return result;
	}
	
	public User searchByName(String name) {
		
		for(int i = 0; i < this.size; i++) {
			if(userList[i].getName().equals(name)) {
				return userList[i];
			}
		}
		return null;
	}
}
