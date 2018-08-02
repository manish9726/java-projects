package test;

import lti.bank.AccountFactory;
import lti.bank.Bank;

public class Test {

	public static void main(String[] args) {

		Bank sav = AccountFactory.openAccount("savings", "Polo");
		sav.summary();
		sav.deposit(2000);
		sav.deposit(4000);
		sav.withdraw(3000);
		sav.withdraw(7000);
		sav.statement();

		// Account ac = new Account("Polo",5000);
		// ac.summary();
		//
		// ac.deposit(3000);
		// System.out.println(ac.getBalance());
		// ac.withdraw(4000);
		// System.out.println(ac.getBalance());
		//
		// ac.withdraw(7000);

		// Savings sa = new Savings ("Polo");
		// sa.summary();

		// sa.deposit(5000);
		// sa.withdraw(1000);
		// sa.summary();

		// Current cr = new Current ("Polo");
		// cr.summary();

		// cr.deposit(5000);
		// //cr.summary();
		//// cr.withdraw(200000);
		//// cr.summary();
		// cr.withdraw(21000);
		// cr.summary();

	}

}
