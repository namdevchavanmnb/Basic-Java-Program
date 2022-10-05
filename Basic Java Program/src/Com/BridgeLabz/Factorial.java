package Com.BridgeLabz;

public class Factorial {
	public static void factorial () {


		int number=5;
		int Factorial=1;
		for(int i=1;i<=5;i++) {
			Factorial = Factorial*i;
		}
		System.out.println("Factorial of"+number+"is"+Factorial);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Number");
		factorial();
	}
}
