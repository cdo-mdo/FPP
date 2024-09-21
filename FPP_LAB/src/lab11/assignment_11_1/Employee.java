package lab11.assignment_11_1;

import java.util.HashMap;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;

	public Employee() {
		salaryRecord = new HashMap<>();
	}
	
	public void addEntry(String date, double salary) {
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {
		if (salaryRecord.containsKey(date)) {
			System.out.println(firstName + " " + lastName + " was paid " + salaryRecord.get(date) + " on " + date);
		}
		else {
			System.out.println(firstName + " " + lastName + " did not receive a paycheck on " + date);
		}
	}

	public void printAveragePaycheck() {
		double sum = 0;
		for (double value: salaryRecord.values()) {
			sum += value;
		}
		double average = sum / salaryRecord.size();
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + average);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
