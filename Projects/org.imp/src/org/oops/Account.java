package org.oops;

class AccountDetails{
	private int account_balance=1000;//hide

	public int getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(int amount) {
		if(amount<0) {
			System.out.println("invalid amount");
		}else {
			account_balance=account_balance+amount;
		}

	}

}

public class Account {
	public static void main(String [] args) {
		AccountDetails  obj = new AccountDetails();
		
		System.out.println("initial amount="+ obj.getAccount_balance());
		obj.setAccount_balance(2000);
		System.out.println("updated amount="+ obj.getAccount_balance());
		
		
	}

}
