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
	//���
	public void withdraw(int amount) throws InsufficientBalanceException {
	    if (amount > balance) {
	        throw new InsufficientBalanceException(
	            String.format("�ܾ��� �����մϴ�. (��û �ݾ�: %d, ���� �ܾ�: %d)", amount, balance)
	        );
	    }
	    balance -= amount;
	}
	//�Ա�
	public void deposit(int amount) {
		balance += amount;
	}

}





