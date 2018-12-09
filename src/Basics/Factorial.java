package Basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The computed factorial value of n is: " + factorial(5));
	}
	
		
		public static int factorial(int n) {
		    if (n == 0) {
		        return 1;
		    }
		    else if (n == 1) {
		        return 1;
		    }
		    System.out.println(n);
		    return factorial(n-1) * n;    
		}
		
	}
	


