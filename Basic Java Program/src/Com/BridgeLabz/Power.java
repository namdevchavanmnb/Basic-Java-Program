package Com.BridgeLabz;

public class Power {
	public static void power() {
		int base = 5;
		int exponent = 4;
		int result = 1;
		while (exponent>0) {
			result = result*base;
			exponent--;

		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the power");
		power();

	}
}