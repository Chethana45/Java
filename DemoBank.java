import java.util.Scanner;

public class DemoBank {
 
	public static void main(String[] args) {
		 Scanner scan  = new Scanner(System.in);
		 double amount, bal;
		 int choice1, choice2;
		 Account.bankPolicy();
		 System.out.println("Enter 1 for savings account\nEnter 2 for current account");
		 System.out.println("Enter the choice: ");
		 choice1 = scan.nextInt();
		 switch(choice1) {
		    case 1:
		    	System.out.print("Enter the balance amount of your account: ");
		    	bal = scan.nextDouble();
		    	SavingsAccount s = new SavingsAccount(bal);
		    	System.out.println("Enter 1 for amount withdrawal\nEnter 2 for amount deposit");
		    	System.out.print("Enter the choice: ");
		    	choice2 = scan.nextInt();
		    	switch(choice2) {
		    		case 1:
		    			System.out.print("Enter the amount to be withdraw: ");
		    			amount = scan.nextDouble();		    			
		    			s.withdraw(amount);
		    			s.display();
		    			break;
		    		case 2:
		    			System.out.print("Enter the amount to be deposit: ");
		    			amount = scan.nextDouble();
		    			s.deposit(amount);
		    			s.display();
		    			break;
		    		default:
		    			System.out.println("Invalid choice");
		    	}
		    	break;
		    case 2:
		    	System.out.print("Enter the balance amount of your account: ");
		    	bal = scan.nextDouble();
		    	CurrentAccount c = new CurrentAccount(bal);
		    	System.out.println("Enter 1 for amount withdrawal\nEnter 2 for amount deposit");
		    	System.out.print("Enter the choice: ");
		    	choice2 = scan.nextInt();
		    	switch(choice2) {
		    		case 1:
		    			System.out.print("Enter the amount to be withdraw: ");
		    			amount = scan.nextDouble();		    			
		    			c.withdraw(amount);
		    			c.display();
		    			break;
		    		case 2:
		    			System.out.print("Enter the amount to be deposit: ");
		    			amount = scan.nextDouble();
		    			c.deposit(amount);
		    			c.display();
		    			break;
		    		default:
		    			System.out.println("Invalid choice");
		    	}
		    	break;
		    default:
		    	System.out.println("Invalid choice");
		 }
		 scan.close();
	}
}
 
interface Account{
	void withdraw(double amount);
	void deposit(double amount);
	static void bankPolicy() {
		System.out.println("Minimum balance for savings account is 1000\nOverdraft limit for savings account is 15000\nOverdraft limit for current account is 50000");
	}
}
 
 
class SavingsAccount implements Account{
	double balance;
	SavingsAccount(double bal){
		balance = bal;
	}
	public void withdraw(double amount) {
		if(balance-amount>1000 && balance>amount) {
			if(amount<=50000) {
				balance-=amount;
			}
			else System.out.println("Withdrawal amount should be less than or equal to 50000");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	void display(){
		System.out.println("Account balance: "+ balance);
	}
}
 
class CurrentAccount implements Account{
	double balance;
	CurrentAccount(double bal){
		balance = bal;
	}
	public void withdraw(double amount) {
		if(amount<=50000 && balance>= amount) {
			balance-=amount;
		}
		else System.out.println("Insufficient balance");
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	void display() {
		System.out.println("Account balance: "+balance);
	}
}
 
