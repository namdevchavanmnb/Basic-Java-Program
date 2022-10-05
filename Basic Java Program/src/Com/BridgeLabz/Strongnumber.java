package Com.BridgeLabz;

import java.util.Scanner;

public class Strongnumber {
	public static boolean StrongNumber(int number){
		int strong = 0;
		int storeValue = number;
		while (number>0){
			int remainder=number % 10;
			strong = (int)Math.pow(remainder,3)+strong;//pow return-double
			number = number/10;
		}
		if (storeValue == strong)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the strong Number ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int number = sc.nextInt();
		boolean b = StrongNumber(number);
		if (b)
			System.out.println("Number is strong:");
		else
			System.out.println("Number not strong");

	}

}


