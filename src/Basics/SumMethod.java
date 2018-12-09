package Basics;
public class SumMethod {

	public static void main(String[] args) {
		
		System.out.println(sum(5));
		  
}
	public static int sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
		System.out.println(sum + " + " + i);
		System.out.println(" = " + sum);
	}
		
		return sum;	

	}
}