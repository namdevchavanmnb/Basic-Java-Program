package Com.BridgeLabz;

public class PerfectNumber {
	public static void checkperfectnumber() {
		int n = 28, sum = 0;

		for (int i = 1; i < n; i++)
		{
			if (n % i == 0)
				sum = sum + i;
		}

		if (sum == n)
			System.out.println (n + " Is a perfect number");
		else
			System.out.println (n + " Is not a perfect number");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the perfect number");
		checkperfectnumber();

	}

}
