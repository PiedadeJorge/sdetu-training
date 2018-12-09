package Basics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {3, 5, 7, 14, 38};
		System.out.println("The Minimum value in the array is: " + findMin(numbers));
		System.out.println("The Maximum value in the array is: " + findMax(numbers));
		System.out.println("The Average value in the array is: " + findAvg(numbers));

	}
	public static int findMin(int...arr ) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				
			}
		}
		return min;
	}
	
	public static int findMax(int...arr ) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
					}
				}
			return max;
			}
	
public static int findAvg(int...arr ) {
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
		sum = sum + arr[i];
				}
		return sum/arr.length;
}
}
