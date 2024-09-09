package lab04.assignment_4_3.employeeinfo;

public class RetirementAccount extends Account {
	private static final double PENALTY = 0.02;

	@Override
	public AccountType getAccType() {
		return AccountType.RETIREMENT;
	}

	RetirementAccount(Employee employee, double balance) {
		super(employee, balance);
	}

	@Override
	public boolean makeWithdrawal(double amt) {
		boolean check = super.makeWithdrawal(amt);
		if (check == false) {
			return false;
		}
		double penaltyAmount = amt * PENALTY;
		double actualWithdraw = amt - penaltyAmount;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Account Type: " + String.valueOf(AccountType.RETIREMENT).toLowerCase() + "\n");
		buffer.append(super.toString() + "\n");
		return buffer.toString();
	}
}
