package lti.bank;

public class CurrentTranscations extends Transactions {

	private String type;
	private double amount, balance;
	private double overdraft;

	public CurrentTranscations() {

	}

	public CurrentTranscations(String type, double amount, double balance) {
		super(type, amount, balance);
	}

	public String toString() {
		return type + "\t" + amount + "\t" + balance + "\t" + overdraft;
	}

}
