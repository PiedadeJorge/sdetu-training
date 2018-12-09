package Basics;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student std1 = new student();
		std1.setNewStudent("AidenKiame");
		std1.setNewSSN("3692587412");
		std1.setCity("Stuttgart");
		std1.setState("Baden Wuertemberg");
		std1.setPhone("+49 635-748-52");
		std1.setUserId();
		std1.setEmail();
		System.out.println(std1.toString());
		std1.checkBalance(5000);
		std1.pay(628.00);
		std1.enroll("Information Systems");
		std1.enroll("E-Commerce");
		std1.enroll("Project Management");
		
		//----------------------------------
		
		student std2 = new student();
		std2.setNewStudent("DamianSidney");
		std2.setNewSSN("3662423412");
		std2.setCity("Kilamba");
		std2.setState("Luanda");
		std2.setPhone("+244 952-114-52");
		std2.setUserId();
		std2.setEmail();
		System.out.println(std2.toString());
		std2.checkBalance(3500);
		std2.pay(412.17);
		std2.enroll("Financial Accounting");
		std2.enroll("Marketing Management");
		std2.enroll("Business Inteligence");
		
		
		//System.out.println(balance);
		//System.out.println();

	}
	}
	
	 // Class to hold student data
	 class student{
		private static int id = 1000;
		private String userID;	//Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	    private String SSN;
	    private String name;
	    private String email;
	    private String phone;
	    private String city;
	    private String state;
	    public String courses;
	    private String balance;
	    
	    
	   //Method
	    public void setNewStudent(String name) {
			this.name = name;
			id++;
		}
	    public void getNewStudent(String name) {
			this.name = name;
	    }
	    public void setNewSSN(String SSN) {
	    	this.SSN = SSN;	
	    }
	 	public String getNewSSN() {
	 		return SSN; 
	 	}
	    public void setUserId(){
	    	int max = 9000;
	    	int min = 1000;
	    	int random = (int) (Math.random() * (max-min) * 10);
	    	userID = id + "" + random + SSN.subSequence(6, 10);
	    	random = random + min;	
	    }
	    //Encapsulation 
	    
	    public void setEmail() {
	     	this.email = email;	
	     	email = name.toLowerCase() + "@scandsbank.com";
	    }
	      
	    void setPhone(String phone) {
	    	this.phone = phone;
	    }
	    
	    private String getPhone() {
	    	return phone;
	    }
	    
	    void setCity(String city) {
	    	this.city = city;
			
		}
		
		public String getCity() {
			return city;
		} 
		void setState(String state) {
		    this.state = state;
				
		}			
	    
	    public void enroll(String courses) {
	    	this.courses = courses + "\n" + courses;
	    	showCourses(courses);
	    	}

	    public void pay(double amount) {
	    	System.out.println("For these courses we have withdraw an amount of $" + amount + " from your account");
			
		}
	    
	    public void checkBalance(double balance) {
	    	System.out.println("Your current balance is " + balance);
			
		}
	    @Override
		public String toString() {
			return "\n[Name: " + name +  "][SSN: " + SSN + "] [Email: " + email + "][User ID: " + userID + "]\n[City: " + city +  "][Phone: " + phone + "][State: " + state + "]\n";
		}
		
		public void showCourses(String courses) {
			System.out.println("You are now enrolled for the following course: " + courses);
		}
		public String getBalance() {
			return balance;
		}
		public void setBalance(String balance) {
			this.balance = balance;
		}
		
	}
	


