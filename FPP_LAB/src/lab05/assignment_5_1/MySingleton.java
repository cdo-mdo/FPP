package lab05.assignment_5_1;

import java.util.Date;

public class MySingleton {
	private static MySingleton instance = new MySingleton();
	
	public static MySingleton getInstance() {
		Date now = new Date();
		System.out.println("Time to get instance of the object " + now.getTime());
		return instance;
	}
	
	private MySingleton() {
		Date now = new Date();
		System.out.println("Time to create instance of the class " + now.getTime());
	}
}
