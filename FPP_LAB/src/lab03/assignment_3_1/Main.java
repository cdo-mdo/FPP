package lab03.assignment_3_1;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Manh Cuong", "Danny", 150000, 2025, Calendar.APRIL, 13);
		Account checkingAccount = new Account(employee, AccountType.CHECKING, 0);
		Account savingAccount = new Account(employee, AccountType.SAVINGS, 0);
		Account retirementAccount = new Account(employee, AccountType.RETIREMENT, 0);
		
		System.out.println(checkingAccount.toString());
		System.out.println(savingAccount.toString());
		System.out.println(retirementAccount.toString());
	}
}
