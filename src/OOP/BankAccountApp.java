package OOP;

public class BankAccountApp {
	
		public static void main(String[] args) {
			
			
		
			BankAccount acc1 = new BankAccount();
			
			acc1.setName("Jorge Santos");
			System.out.println(acc1.getName());
			acc1.setSSN("N0451AO524B4");
			System.out.println(acc1.getSSN());
			
			acc1.accountNumber = "2547124865471";
			acc1.balance = 765;
			//System.out.println(acc1.toString());
			
			acc1.deposit(350);
			acc1.deposit(200);
			acc1.deposit(820);
			acc1.withdraw(3600);
			
			acc1.setRate();
			acc1.increaseRate();
			
			//BankAccount acc2 = new BankAccount("Check Only Account");
			//BankAccount acc3 = new BankAccount("Savings Account", 999);
			
			//acc3.checkBalance();
			
			//CDAccounts cd1 = new CDAccounts();
			//cd1.setName("Aiden Kiami dos Santos");
			//cd1.accountNumber = "8564782145214";
			//cd1.balance = 632;
			//cd1.accountType = "CD Account";
			//System.out.println(cd1.toString());
		
		}
}

