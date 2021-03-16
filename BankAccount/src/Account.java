
public class Account {
	private int account_number;
	private int account_balance;
	
	public Account(String name, int account_number, int account_balance) {
		this.account_number=account_number;
		this.account_balance=account_balance;
		System.out.println("You have created a bank account for "+name+
				" with Account Number: "+account_number+" and your Account Balance is $"
				+account_balance);
	}
	public void account_deposit(int depositAmt) {
		if(depositAmt<0) {System.out.println("You can not deposit a negative amount");}
		else {this.account_balance=this.account_balance+depositAmt;
		System.out.println("You have deposited $"+depositAmt+" into your account");}
	}
	public void account_withdraw(int withdrawAmt) {
		if(withdrawAmt>this.account_balance) {System.out.println("You can not withdraw more than your account balance");}
		else {this.account_balance=this.account_balance-withdrawAmt;
		System.out.println("You have withdrawn $"+withdrawAmt+" from your account"+"YOUR BALANCE IS:$"+account_balance);}
	}
	public void transfer_money(int transferAmt, String AccountOwner, int account2_number, int account2_balance) {
		final int Account2_number;
		int Account2_balance=account2_balance;
		Account2_number=account2_number;
		if(transferAmt<0) {System.out.println("You can not transfer a negative amount from Account Number:"+this.account_number);}
		else if(transferAmt>this.account_balance){System.out.println("You can not transfer more than your account balance in from Account Number:"+this.account_number);}
		else {this.account_balance=this.account_balance-transferAmt;
			Account2_balance=  Account2_balance+transferAmt;
			 System.out.println("Account Balance for Account 2 is :$"+Account2_balance);
			 System.out.println("You have transferred $"+transferAmt+" to "+AccountOwner+" with Account Number:"+Account2_number+" and new balance $"+Account2_balance);
			System.out.println("and your Account Balance for Account Number:"+this.account_number+" is $"+this.account_balance);
	}}
		}
