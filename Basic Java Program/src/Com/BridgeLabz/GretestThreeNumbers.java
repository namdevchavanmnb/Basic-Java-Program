package Com.BridgeLabz;

public class GretestThreeNumbers {
	public static void GretestThreeNumber() {

		int num1 = 1050, num2 = 2050, num3 = 3050;
		if (num1 >= num2 && num1 >= num3)
			System.out.println (num1 + " is the greatest");
		else if (num2 >= num1 && num2 >= num3)
			System.out.println (num2 + " is the greatest");
		else if (num3 >= num1 && num3 >= num2)
			System.out.println (num3 + " is the greatest");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Gretest Three Number are");
		GretestThreeNumber();
	}
}