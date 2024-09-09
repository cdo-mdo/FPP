package lab03.assignment_3_2.employeeinfo;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;

	private AccountType acctType;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);

	}

	public String toString() {
		return "Account type: " + acctType.toString().toLowerCase() + "\n" + "Current bal: " + balance;
	}

	/**
	 * Update balance by amount deposit
	 * 
	 * @param deposit deposit amount
	 */
	public void makeDeposit(double deposit) {
		// implement
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
	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false;
		}
		balance = balance - amount;
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

}
