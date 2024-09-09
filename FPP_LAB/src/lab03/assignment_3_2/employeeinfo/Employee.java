package lab03.assignment_3_2.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;

	private LocalDate hireDate;

	public String getName() {
		return name;
	}

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case AccountType.CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case AccountType.SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case AccountType.RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		switch (acctType) {
		case AccountType.CHECKING:
			checkingAcct.makeWithdrawal(amt);
			break;
		case AccountType.SAVINGS:
			savingsAcct.makeWithdrawal(amt);
			break;
		case AccountType.RETIREMENT:
			retirementAcct.makeWithdrawal(amt);
			break;
		}
		return true;
	}

	public String getFormattedAcctInfo() {
		StringBuffer buf = new StringBuffer();
		if (checkingAcct != null) {
			buf.append(checkingAcct.toString());
			buf.append("\n");
		}
		if (savingsAcct != null) {
			buf.append(savingsAcct.toString());
			buf.append("\n");
		}
		if (retirementAcct != null) {
			buf.append(retirementAcct.toString());
			buf.append("\n");
		}
		return buf.toString();
	}

}