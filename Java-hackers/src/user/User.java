package user;

import java.util.HashSet;
import java.util.Set;

public class User {

	String username;
	String password;
	int age;
	Set<Integer> orderIDs;

	
	public User(String username, String password, int age, Set<Integer> orderIDs) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.orderIDs = orderIDs;
	}


	public static void main(String[] args) {
     
		Set<Integer> a = new HashSet<Integer>();
		a.add(12121);
		User raj = new User("rajkhare1","efforts007",10 , a);

	}

}
