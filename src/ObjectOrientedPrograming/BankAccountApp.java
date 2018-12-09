package ObjectOrientedPrograming;

import Basics.IInterest;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccounts acc1 = new BankAccounts("365268254", 1000);
		acc1.setName("Jorge Santos");
		System.out.println("We thank you for choosing SC&S Bank Mr: " + acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBills(450);
		acc1.Accrue();
		System.out.println(acc1.toString());
				
		}
}
	 class BankAccounts implements IInterest{
		
		private static int iD = 100;
		private static final String routingNumber = "23122701";
		private String accountNumber;    // ID + random 2 dig + first 2 dig of SSN
		private String name;
		private String SSN;
		private double balance;
	
		//Constructors 
		
		public BankAccounts(String SSN, double initdeposit) {
			balance = initdeposit;
			System.out.println("New account creataed");
			this.SSN = SSN;
			iD++;
			setAccountNumber();	
		}
		
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random + SSN.substring(0, 2);
			System.out.println("Your account number: " + accountNumber);
			
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void payBills(double amount) {
			System.out.println("Paying bills: " + amount);
			showBalance();
			balance = balance-amount;
			
		}
		
		public void makeDeposit(double amount) {
			System.out.println("Making deposit: " + amount);
			showBalance();
			balance = balance+amount;
			
			
		}
		
		public void showBalance() {
			System.out.println("Balance: " + balance);
		}

		@Override
		public void Accrue() {
			balance = balance * (1 + rate/100);
			showBalance();
			
		}
		
		public String toString() {
			return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance;
		}
		
	}
	

	
	
		
	

	


