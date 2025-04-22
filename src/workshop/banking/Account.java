package workshop.banking;

import workshop.banking.exception.InsufficientBalanceException;

public class Account {
	private String custId;
	private String acctId;
	private int balance;

	public Account() {

	}

	public Account(String custId, String acctId, int balance) {
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	//출금
	public void withdraw(int amount) throws InsufficientBalanceException {
	    if (amount > balance) {
	        throw new InsufficientBalanceException(
	            String.format("잔액이 부족합니다. (요청 금액: %d, 현재 잔액: %d)", amount, balance)
	        );
	    }
	    balance -= amount;
	}
	//입금
	public void deposit(int amount) {
		balance += amount;
	}

}





