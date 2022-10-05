package Com.BridgeLabz;

import java.util.Scanner;

public class HarshadNumber {	
	public static boolean isHarshad(int number) {		
		int digitSum = sumOfDigits(number);

		if(number % digitSum == 0)
			return true;
		return false;
	}
	private static int sumOfDigits(int number) {
		int sum = 0;
		while(number != 0) {			
			sum += number%10;			
			number /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {	
		int number = 0;
		boolean result = false;	
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter an integer number:: ");
		number = scan.nextInt();

		result = isHarshad(number);
		if(result)
			System.out.println(number +
					" is a Harshad number");
		else
			System.out.println(number +
					" is not a Harshad number");

		scan.close();
	}
}

