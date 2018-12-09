package Basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 22;
		if(temperature > 26) {
			System.out.println("Its a pleasant day, wear shorts and T-shirt! ");
		}else if (temperature < 25 ) {
			System.out.println("Its a little cold today, wear trousers and a pullover! ");
		}else {
			System.out.println("Well... lets see what happens! ");
		}

	}
}