package sample;

public class Convert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Chinese -> " + Integer.toHexString((int)'中')+ ", " + Integer.toHexString((int)'文'));
		System.out.println("English -> " + Integer.toHexString((int)'英')+ ", " + Integer.toHexString((int)'文'));
		System.out.println("title -> " + Integer.toHexString((int)'简')+ ", " + Integer.toHexString((int)'单') + " L10n");
		//Chinese=中文
		//English=英文
		//title=简单L10n

	}

}
