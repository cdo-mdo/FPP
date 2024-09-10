package lab05.assignment_5_1;

public class Test {
	public static void main(String[] args) {
		MySingleton ref1 = MySingleton.getInstance();
		MySingleton ref2 = MySingleton.getInstance();
		
		if (ref1.hashCode() != ref2.hashCode()) {
			System.out.println(ref1.getClass().getSimpleName() + " and " + ref2.getClass().getSimpleName() + " are different instance");
		}
		else {
			System.out.println(ref1.getClass().getSimpleName() + " and " + ref2.getClass().getSimpleName() + " are same instance");
		}
	}
}
