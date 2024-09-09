package lab04.assignment_4_3.employeeinfo;

public class SavingsAccount extends Account {
	private static final double MONTHLY_INTEREST = 0.25 / 100;

	@Override
	public AccountType getAccType() {
		return AccountType.SAVINGS;
	}

	SavingsAccount(Employee employee, double balance) {
		super(employee, balance);
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = MONTHLY_INTEREST * baseBalance;
		return baseBalance + interest;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Account Type: " + String.valueOf(AccountType.SAVINGS).toLowerCase() + "\n");
		buffer.append(super.toString() + "\n");
		return buffer.toString();
	}
}
