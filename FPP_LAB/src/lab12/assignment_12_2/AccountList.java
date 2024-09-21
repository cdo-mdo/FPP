package lab12.assignment_12_2;

import lab12.assignment_12_2.employeeinfo.*;

public class AccountList {
	private Account[] accounts;
	private int size;
	private int pointToResize;

	private final int MAX_SIZE = 10;

	public AccountList() {
		accounts = new Account[MAX_SIZE];
		size = 0;
		pointToResize = 1;
	}

	public void add(Account account) {
		accounts[size] = account;
		size++;
		if (size > MAX_SIZE * pointToResize) {
			Account[] tempRef = accounts;
			pointToResize++;
			accounts = new Account[MAX_SIZE * pointToResize];
			System.arraycopy(tempRef, 0, accounts, 0, size);
		}
	}

	public Account get(int i) {
		if (i >= size) {
			return null;
		}
		return accounts[i];
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < size; i++) {
			buffer.append(accounts[i].toString());
		}
		return buffer.toString();
	}

	public int getNumberOfAccount() {
		return size;
	}

	public String getNameOfAllAcounts() {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < size; i++) {
			buffer.append(i + ". " + String.valueOf(accounts[i].getAccType()).toLowerCase() + "\n");
		}
		return buffer.toString();
	}

	public AccountType getAccountType(int accountIndex) {
		return accounts[accountIndex].getAccType();
	}
}
