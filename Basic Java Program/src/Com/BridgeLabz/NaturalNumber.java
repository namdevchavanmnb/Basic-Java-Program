package Com.BridgeLabz;

public class NaturalNumber {
	public static void naturalnumber() {

		int n = 10;
		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println (sum);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Natural Number");
		naturalnumber();
	}
}


