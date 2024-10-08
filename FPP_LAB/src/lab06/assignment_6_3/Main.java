package lab06.assignment_6_3;

import java.awt.EventQueue;
import java.util.Scanner;

import lab04.assignment_4_3.employeeinfo.Employee;
import lab06.assignment_6_3.gui.UserIO;

public class Main {
	private static Scanner sc;

	private static Employee[] listEmployees;
	
	private static String mainMenu() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("A. See a report of all accounts (Y/N).\n");
		return buffer.toString();
	}

	public static String getAllAccountsInfo() {
		return getAllAccountsInfo(listEmployees);
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

		listEmployees = emps;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserIO userIO = new UserIO();
				
				userIO.setVisible(true);
				
				String mainMenu = mainMenu();
				userIO.setOutputValue(mainMenu);
				
			}
		});

	}
}
