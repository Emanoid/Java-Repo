
public class Main {
	public static void main(String[] args) {
	//Account Account-Name = new Account(name,number,amount);
	Account Moses=new Account("Moses", 488324536, 500);
	Account Gabriel= new Account("Gabriel", 532320492, 1000);
	
	//System.out.println(Moses.name);
	//System.out.println(Moses.account_number);
	Moses.account_deposit(-60);
	Moses.account_deposit(200);
	
	
	Moses.account_withdraw(1000);
	Moses.account_withdraw(300);
	System.out.println("");
	System.out.println("");
	
	Gabriel.transfer_money(-500, "Moses", 488324536, 500);
	Gabriel.transfer_money(1500, "Moses", 488324536, 500);
	Gabriel.transfer_money(500, "Moses", 488324536, 400);
	Moses.account_withdraw(300);
	
	}
}
