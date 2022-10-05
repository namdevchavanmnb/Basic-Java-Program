package Com.BridgeLabz;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter starting number:");
		int startNumber = sc.nextInt();
		System.out.print(" enter ending number: ");
		int endNumber = sc.nextInt();
		System.out.println("Prime numbers between range " + startNumber + " and " + endNumber + " are: ");
		int counter;
		for(int a = startNumber ; a <= endNumber ; a++)
		{
			// here's the logic to check if number is prime or not
			counter = 0;
			for(int b = 1 ; b <= a ; b++)   
			{
				if(a % b == 0)
					counter = counter + 1;
			}
			if(counter == 2)
				System.out.println(a);
		}
		sc.close();
	}
}


