package lti.bank;

/**
 * This class represents generalized bank account
 * 
 * @author Manish'} Prasanna
 * @version 1.0
 */
public abstract class Account implements Bank {

	private int acntNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Transactions[] txns;
	protected CurrentTranscations[] crrtxns;// ?
	protected int idx;
	protected int idxx;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		// Instantiating transaction array for the account
		txns = new Transactions[10];
		crrtxns = new CurrentTranscations[10];
		// Adding opening account transaction
		txns[idx++] = new Transactions("08", balance, balance);
	}

	public void summary() {

		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		balance += amount;
		txns[idx++] = new Transactions("Cr", amount, balance); // ?
	}

	// public abstract void withdraw(double amount);

	public void statement() {

		System.out.println("Statement of A/C: " + acntNo);
		for (int i = 0; i < idx; i++)
			System.out.println(txns[i]);
	}
}
