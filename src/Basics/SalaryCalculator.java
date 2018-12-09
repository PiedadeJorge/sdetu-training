package Basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		//Declaring a variable
		String carrera;
		
		System.out.println("This is it! the programas is starting");
		
		//Variable definition
		carrera = "Software Developer";
		System.out.println("My career : " + carrera);
		
		int hoursperWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = hoursperWeek * weeksPerYear * rate;
		System.out.println("My current earnings as a " + carrera + " at the rate of: " + rate + " is $" + salary);
	} 
}

// Compute our national Salary
// rate * hoursperWeek * weeksPerYear