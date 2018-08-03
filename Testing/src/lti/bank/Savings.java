package lti.bank;

public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
		txns[idx++] = new Transactions("08", balance, balance);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {

		if (amount <= (balance - MIN_SAV_BAL)) {

			balance -= amount;
			txns[idx++] = new Transactions("Dr", amount, balance);
		} else
			throw new BalanceException("Sorry!!!Insufficient Funds");

	}

}
