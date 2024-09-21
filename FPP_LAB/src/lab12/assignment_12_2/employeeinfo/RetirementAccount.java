package lab12.assignment_12_2.employeeinfo;

import lab12.assignment_12_2.OverdrawnAccountException;

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
	public boolean makeWithdrawal(double amt) throws OverdrawnAccountException {
		double penaltyAmount = amt * PENALTY;
		double actualWithdraw = amt + penaltyAmount;
		try {
			return super.makeWithdrawal(actualWithdraw);
		}
		catch (OverdrawnAccountException ex) {
			System.out.println("After computing penalties, your withdrawal amount exceeds your balance.");
			throw ex;
		}
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("Account Type: " + String.valueOf(AccountType.RETIREMENT).toLowerCase() + "\n");
		buffer.append(super.toString() + "\n");
		return buffer.toString();
	}
}
