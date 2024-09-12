import java.util.*;
public class AtmInterface{
    private static class BankAccount{
    	private String accountNumber;
    	private int bal;
    	public BankAccount(String accountNumber, int bal) {
        	this.accountNumber = accountNumber;
        	this.bal = bal;
    	}
    	public void withdraw(int amount){
	    	if(amount>0 && amount<=bal){
	        	bal-=amount;
	        	System.out.println("Rs."+amount+" has been successfully withdrawn.");
	    	}
			else if(amount<0){
				System.out.println("Invalid amount!");
			}
			else
			System.out.println("No sufficient Balance");
		}
		public void deposit(int amount){
			if(amount>0 && bal+amount<=500000){
				bal+=amount;
				System.out.println("Rs."+amount+" has been successfully deposited.");
			}
			else if(bal+amount>500000){
				System.out.println("Transaction declined due to account limit.");
			}
			else
				System.out.println("Invalid amount!");
		}
		public void checkBalance(){
			System.out.println("Balance: Rs."+bal);
		}
	}
	private static class ATM {
		private BankAccount bankAccount;
		public ATM() {
		}
		public void setBankAccount(BankAccount bankAccount) {
			this.bankAccount = bankAccount;
		}
		public void withdraw(int amount){
			if (bankAccount != null)
				bankAccount.withdraw(amount);
			else
				System.out.println("No bank account connected.");
		}
		public void deposit(int amount){
			if (bankAccount != null)
				bankAccount.deposit(amount);
			else
				System.out.println("No bank account connected.");
		}
		public void checkBalance(){
			if (bankAccount != null)
				bankAccount.checkBalance();
			else
				System.out.println("No bank account connected.");
		}
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int bal=r.nextInt(500000);
		System.out.println("Enter Account Number:");
		String accountNumber=sc.next();
		BankAccount account = new BankAccount(accountNumber,bal);
    	ATM atm = new ATM();
    	atm.setBankAccount(account);
	    int opt=0;
	    while(opt!=4){
			System.out.println("\n1: Withdraw\t2: Deposit\t3: Check Balance\t4: Exit\nChoose an Option:");
			opt=sc.nextInt();
	        switch(opt){
	            case 1:
	                System.out.println("Enter amount to withdraw:");
	                int amount=sc.nextInt();
	                atm.withdraw(amount);
	                break;
	            case 2:
	                System.out.println("Enter amount to deposit:");
	                amount=sc.nextInt();
	                atm.deposit(amount);
	                break;
	            case 3:
	                atm.checkBalance();
	                break;
	            case 4:
	                System.out.println("Exited");
	                break;
	            default:
	            System.out.println("Invalid Option");
	            break;
	        }
	    }
	}
}