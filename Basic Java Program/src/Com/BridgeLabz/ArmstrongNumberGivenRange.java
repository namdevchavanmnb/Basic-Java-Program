package Com.BridgeLabz;

import java.util.Scanner;

public class ArmstrongNumberGivenRange {
	public static void checkArmstrongGivenRange(int initialLimit, int finalLimit){
		for (int i = initialLimit; i<=finalLimit; i++){
			boolean arm = ArmstrongNumber.checkArmstrongNumber(i);
			if (arm){
				System.out.println(i);
			}
		}

	}
	public static void main(String[] args) {
		System.out.println("Welcome to program armstrong number given range");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter InitialNumber:");
		int initialNUmber = sc.nextInt();
		System.out.println("Enter lastNumber:");
		int lastNumber = sc.nextInt();
		checkArmstrongGivenRange(initialNUmber,lastNumber);

	}

}


