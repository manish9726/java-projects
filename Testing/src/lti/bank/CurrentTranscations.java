package lti.bank;

public class CurrentTranscations extends Transactions {

	private double overdraft;

	public CurrentTranscations() {

	}

	public CurrentTranscations(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;

	}

	public String toString() {
		return type + "\t" + amount + "\t" + balance + "\t" + overdraft;
	}

}
