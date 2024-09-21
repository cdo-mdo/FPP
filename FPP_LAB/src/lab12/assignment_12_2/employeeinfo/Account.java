package lab12.assignment_12_2.employeeinfo;

import lab12.assignment_12_2.OverdrawnAccountException;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;
	}

	public AccountType getAccType() {
		return AccountType.NONE;
	}

	public String toString() {
		return "Current bal: " + balance;
	}

	/**
	 * Update balance by amount deposit
	 * 
	 * @param deposit deposit amount
	 */
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	/**
	 * Updates the balance field and return true, unless withdrawal amount is too
	 * large; in that case, it does not modify the balance field, and return false
	 * 
	 * @param amount withdraw amount
	 * @return true if can withdraw amount, false if the withdraw amount is bigger
	 *         than balance
	 */
	public boolean makeWithdrawal(double amount) throws OverdrawnAccountException {
		System.out.println("DEBUG-0 amount = " + amount);
		if (amount > balance) {
			System.out.println("balance not enough for withdraw!");
			throw new OverdrawnAccountException("balance " + balance + " is not enough for withdraw amount " + amount);
		}
		balance = balance - amount;
		return true;
	}

	public double getBalance() {
		return balance;
	}

}
