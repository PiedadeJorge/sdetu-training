package ObjectOrientedPrograming;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccounts la = new LoanAccounts();
		la.setRate();
		la.increaseRate();
		la.amortSchedule(880);
		la.setTerm(25);
		
		//Polimorphism
		
		IRate account1 = new LoanAccounts();
		account1.setRate();
		account1.increaseRate();
		
		
	}

}
