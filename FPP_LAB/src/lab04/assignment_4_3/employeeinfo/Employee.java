package lab04.assignment_4_3.employeeinfo;

import java.time.LocalDate;

import lab04.assignment_4_3.AccountList;

public class Employee {

	private String name;
	private LocalDate hireDate;
	private AccountList accounts;

	public String getName() {
		return name;
	}

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}

	public void createNewChecking(double startAmount) {
		Account checkingAccount = new CheckingAccount(this, startAmount);
		accounts.add(checkingAccount);
	}

	public void createNewSavings(double startAmount) {
		Account savingsAccount = new SavingsAccount(this, startAmount);
		accounts.add(savingsAccount);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementAccount = new RetirementAccount(this, startAmount);
		accounts.add(retirementAccount);
	}

	public int getNumberOfAccount() {
		return accounts.getNumberOfAccount();
	}

	public String getNameOfAllAccounts() {
		return accounts.getNameOfAllAcounts();
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		return selected.makeWithdrawal(accountIndex);
	}

	public String getFormattedAcctInfo() {
		StringBuffer buf = new StringBuffer();
		buf.append("\nACCOUNT INFO FOR " + name + ":\n\n");
		buf.append(accounts.toString());
		return buf.toString();
	}

	public String getAccountTypeName(int accountIndex) {
		return String.valueOf(accounts.getAccountType(accountIndex));
	}
}