package workshop.banking.test;

import workshop.banking.Account;
import workshop.banking.exception.InsufficientBalanceException;

public class TestAccount {

	public static void main(String[] args) {
		Account acct1 = new Account();
		acct1.setCustId("A1100");
		acct1.setAcctId("221-22-3477");
		acct1.setBalance(100000);
		
		try {
			System.out.println(acct1.getCustId() + " " + acct1.getAcctId());
			System.out.println("초기잔액 : " + acct1.getBalance());
			acct1.deposit(10000);
			System.out.println("입금 후 잔액 : " + acct1.getBalance());
			acct1.withdraw(20000);
			System.out.println("출금 후 잔액 :" + acct1.getBalance());
			
			Account acct2 = new Account("A1200", "221-22-3488", 150000);
			System.out.println(acct2.getCustId() + " " + acct2.getAcctId());
			System.out.println("초기잔액 : " + acct2.getBalance());
			acct2.deposit(10000);
			System.out.println("입금 후 잔액 : " + acct2.getBalance());
			acct2.withdraw(20000);
			System.out.println("출금 후 잔액 :" + acct2.getBalance());
			
			acct2.withdraw(150000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
