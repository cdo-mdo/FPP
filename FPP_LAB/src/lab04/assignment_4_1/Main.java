package lab04.assignment_4_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Professor professor1 = new Professor("Prof1", 1970, 12, 01, 10000000);
		Professor professor2 = new Professor("Prof2", 1971, 11, 01, 9000000);
		Professor professor3 = new Professor("Prof3", 1972, 10, 01, 8000000);
		professor1.setNumberOfPublications(10);
		professor2.setNumberOfPublications(10);
		professor3.setNumberOfPublications(10);

		Secretary secretary1 = new Secretary("Secre1", 1980, 12, 10, 500000);
		Secretary secretary2 = new Secretary("Secre2", 1981, 11, 10, 400000);
		secretary1.setOvertimeHours(200);
		secretary2.setOvertimeHours(200);

		DepEmployee[] department = new DepEmployee[5];
		department[0] = professor1;
		department[1] = professor2;
		department[2] = professor3;
		department[3] = secretary1;
		department[4] = secretary2;

		double totalSalary = 0;
		for (int i = 0; i < department.length; i++) {
			totalSalary += department[i].computeSalary();
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see total salary of department? (Y/N) ");
		String response = sc.next();
		sc.close();
		if ("y".equals(response.toLowerCase())) {
			System.out.printf("%,.2f\n", totalSalary);
		}
	}

}
