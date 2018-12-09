package Basics;
import java.util.Arrays;
public class Methods {
	
public static void main(String[] args) {	 
	 
	int[] Array;
	Array = new int [5];
	Array[0] = 10;
	Array[1] = 20;
	Array[2] = 30;
	Array[3] = 40;
	Array[4] = 50;
    	
        System.out.println(smallest(Array));
        System.out.println(biggest(Array));
        System.out.println(average(Array));

    }

    	static int smallest(int[] Array) {
    		System.out.println("The lowest value in the Array is:");
    		return Arrays.stream(Array).min().getAsInt();
    }
    	static int biggest(int[] Array) {
    		System.out.println("The Heighest value in the Array is:");
            return Arrays.stream(Array).max().getAsInt();
    	}
    	
    	static double average(int[]  Array) {
    		System.out.println("The Average Value of the Array is: ");
    		return Arrays.stream(Array).average().getAsDouble();
    	}
}

