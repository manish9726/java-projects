package lti.bank;

public class Current extends Account {

	protected double overdraft;

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = OVERDRAFT_AMT;
		txns[idx++] = new CurrentTranscations("08", balance, balance,overdraft);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {

		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT) {

			balance += overdraft - OVERDRAFT_AMT;
			overdraft = OVERDRAFT_AMT;
		}
		txns[idx++] = new CurrentTranscations("08", balance, balance,overdraft);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				overdraft += balance;
				balance = MIN_CUR_BAL;
			}
			txns[idxx++] = new CurrentTranscations("Drr", amount, balance, overdraft);

		}

		else
			throw new BalanceException("Insufficient Funds!");

	}

}
