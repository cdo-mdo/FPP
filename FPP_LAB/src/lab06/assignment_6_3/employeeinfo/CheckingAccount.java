package lab06.assignment_6_3.employeeinfo;

public class CheckingAccount extends Account {
	private static final double CHECK_BALANCE_SERVICE_CHARGE = 5;

	@Override
	public AccountType getAccType() {
		return AccountType.CHECKING;
	}

	CheckingAccount(Employee employee, double balance) {
		super(employee, balance);
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		double serviceCharge = CHECK_BALANCE_SERVICE_CHARGE;
		return baseBalance + serviceCharge;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Account Type: " + String.valueOf(AccountType.CHECKING).toLowerCase() + "\n");
		buffer.append(super.toString() + "\n");
		return buffer.toString();
	}
}
