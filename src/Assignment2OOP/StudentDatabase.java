package Assignment2OOP;

public class StudentDatabase {
	
	public static void main(String[] args) {
		newStudent st1 = new newStudent("Aiden","126327473245");
		//newStudent st2 = new newStudent("Damian","122365873245");
		//newStudent st3 = new newStudent("Lily","122745873245");
		
		st1.enroll("Math");
		st1.enroll("English");
		
		
		st1.showBalance();
		st1.showCourses();
		st1.payFees(1500);
		st1.showBalance();
		st1.getEmail();
		System.out.println(st1.toString());
}
}
	class newStudent{
		private static int id = 1000;		//Combination of Static ID, random 4-digit number between 1000 
		private String name;
		private String ssn;
		private String userId;
		private String city;
		private String state;
		private String phone;
		private String courses = "";
		private String email;
		private static final int costOfCourse = 800;
		private int balance = 0;
		
	public newStudent(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		id++;
		setEmail("");
		setIdNumber();
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmail(String email) {
		email = name.toLowerCase() + "."+id+ "@scandservices.com";
		System.out.println(email);	
	}
	public String getEmail() {
		return email;
		
	}
	private void setIdNumber() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max-min));
		userId = id + "" + random + ssn.subSequence(6, 10);
		random = random + min;
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + " " + courses;
		//System.out.println("You are now enrolled on the " + courses + " course.");
		balance = balance + costOfCourse;	
	}
	public void payFees(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
	}
	public void showBalance() {	
		System.out.println("Your cuerrent balance is: " + balance);
	}
	public void showCourses() {
		System.out.println("You are now enrolled on the " + courses + " course.");

	}
	@Override
	public String toString() {
			return "[Name: " + name +  "] [Courses: " + courses + "] [Balance: " + balance + "][Email: " + email + "]";
	}	
		
}
