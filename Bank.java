package javapractice;

public class Bank {
	static int currentBalence =1000;
	public static void greetCustomer() {
	System.out.println("hello, welcome to the banking");	
	}
	public void deposit(int amount) {
		currentBalence= currentBalence+amount;
		System.out.println("amount is deposited successsfully");
	}
	public void withdrawl(int amount) {
		currentBalence= currentBalence - amount;
		System.out.println("amount is withdrawn successfully");		
	}
	public int getCurrentBalence() {
		return currentBalence; 
		 
	}
	public static void main(String[] args) {
		Bank bank=new Bank();
		greetCustomer();
		System.out.println("current balence is: "+bank.getCurrentBalence());
		bank.deposit(500);
		System.out.println("current balence is: "+bank.getCurrentBalence());
		bank.withdrawl(300);
		System.out.println("current balence is: "+bank.getCurrentBalence());
		
	}
	
}
