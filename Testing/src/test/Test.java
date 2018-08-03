package test;

import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;
import lti.bank.Current;

public class Test {

	public static void main(String[] args) {

//		Bank sav = AccountFactory.openAccount("savings", "Polo");
//		sav.summary();
//		sav.deposit(2000);
//		sav.deposit(4000);
//		try {
//			sav.withdraw(3000);
//		} catch (BalanceException e3) {
//			// TODO Auto-generated catch block
//			e3.printStackTrace();
//		}
//		try {
//			sav.withdraw(7000);
//		} catch (BalanceException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		sav.statement();
//          
		
		Current curr=new Current("Phill");
		curr.summary();
		curr.deposit(2000);
		curr.deposit(4000);
//		try {
//			curr.withdraw(3000);
//		} catch (BalanceException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		try {
			curr.withdraw(10000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); ///for developers to troubleshoot
			System.out.println(e);/// for logging purposre to edit
			//System.out.println(e.getMessage());
		}
		curr.statement();
		
	}

}
