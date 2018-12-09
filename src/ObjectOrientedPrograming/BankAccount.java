package ObjectOrientedPrograming;



public class BankAccount implements IRate{
	
	String accountNumber;
	//Static belongs to the class not the object
	static final String routingNumber = "0123456";
	private String SSN;
	private String name;
	String accountType;
	double balance = 0; 
	
//Constructor definition
	// 1 Used define, setup, initialize property of an object 

	BankAccount(){
		System.out.println("SC&S FINANCIAL SERVICES--");
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType){
		System.out.println("Account Type: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("Account Type: " + accountType);
		System.out.println("SC&S Finance");
		//local variable
		String ErrorMsg = null;
		
		if (initDeposit <= 1000) {
			
			ErrorMsg = "The minimun deposit amount for this account is $ 1,000.00. your current blance is: $" + balance;
			}else {		
		}	ErrorMsg = "Thank you for choosing SC&S Bank";		
			System.out.println(ErrorMsg);
			balance = balance + initDeposit; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "Name: " + name;
	}
	public String getSSN() {
		return "Social Security Number: " + SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		
	
	

	//Define methdods

	
	}

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
	}
	void checkBalance() {
		 System.out.println("Your current balance is: $ " + balance);
	}
	
	void getStatus() {
		
	}
	
	private void showActivity(String activity) {
		System.out.println("Your Recent Activity: " + activity);
		System.out.println("Your New Balance Is: $" + balance);
		
	}
	@Override
	public String toString() {
		return "  [ " + name + ", "  + accountNumber + ", BALANCE: $" + balance + " ]";
	}
	}

