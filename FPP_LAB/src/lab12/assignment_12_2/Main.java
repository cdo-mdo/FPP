package lab12.assignment_12_2;

import java.util.Scanner;

import lab12.assignment_12_2.employeeinfo.*;

public class Main {
	private static Scanner sc;

	private static String mainMenu() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("A. See a report of all accounts.\n");
		buffer.append("B. Make a deposit.\n");
		buffer.append("C. Make a withdrawal.\n");
		return buffer.toString();

	}

	private static String getAllAccountsInfo(Employee[] employees) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < employees.length; i++) {
			buffer.append(employees[i].getFormattedAcctInfo());
		}
		return buffer.toString();
	}

	private static String getEmployeeNames(Employee[] employees) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < employees.length; i++) {
			buffer.append(i + ". " + employees[i].getName() + "\n");
		}
		return buffer.toString();

	}

	private static int processEmployeeSelection(Employee[] employees) {
		String employeeNames = getEmployeeNames(employees);
		System.out.println(employeeNames);
		int empIndex;
		while (true) {
			System.out.print("Select an employee: (type a number) in range 0 - " + (employees.length - 1) + " ");
			empIndex = sc.nextInt();
			if (empIndex >= 0 && empIndex <= employees.length - 1) {
				break;
			}
		}
		return empIndex;
	}

	private static int processAccountSelection(Employee employee) {
		String accountTypes = employee.getNameOfAllAccounts();
		System.out.println(accountTypes);
		int numberOfAccount = employee.getNumberOfAccount();
		int accIndex;
		while (true) {
			System.out.print("Select an employee: (type a number) in range 0 - " + (numberOfAccount - 1) + " ");
			accIndex = sc.nextInt();
			if (accIndex >= 0 && accIndex <= numberOfAccount - 1) {
				break;
			}
		}
		return accIndex;
	}

	public static void main(String[] args) {
		int numberOfEmployee = 3;
		Employee[] emps = new Employee[numberOfEmployee];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		String mainMenu = mainMenu();
		System.out.println(mainMenu);
		System.out.print("Make a selection (A/B/C) ");

		sc = new Scanner(System.in);
		String key = sc.next();
		int empIndex;
		int accIndex;
		double amount;
		String accountTypeName;
		switch (key.toUpperCase()) {
		case "A":
			String accountsInfo = getAllAccountsInfo(emps);
			System.out.println(accountsInfo);
			break;
		case "B":
			empIndex = processEmployeeSelection(emps);
			accIndex = processAccountSelection(emps[empIndex]);
			accountTypeName = emps[empIndex].getAccountTypeName(accIndex).toLowerCase();
			System.out.print("Deposit amount: ");
			amount = sc.nextDouble();
			emps[empIndex].deposit(accIndex, amount);
			System.out.printf("@%.2f has been deposited in the %s account of %s\n", amount, accountTypeName,
					emps[empIndex].getName());
			break;
		case "C":
			empIndex = processEmployeeSelection(emps);
			accIndex = processAccountSelection(emps[empIndex]);
			accountTypeName = emps[empIndex].getAccountTypeName(accIndex).toLowerCase();
			System.out.print("Withdraw amount: ");
			amount = sc.nextDouble();
			if (emps[empIndex].withdraw(accIndex, amount) == true) {
				System.out.printf("@%.2f has been withdrawn from the %s account of %s\n", amount, accountTypeName,
					emps[empIndex].getName());
			}
			break;
		}
		sc.close();

	}
}
