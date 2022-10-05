package Com.BridgeLabz;

public class CountSumofDigits {

	public static void SumofDigits() {
		int num = 1234;
		int Sum = 0;
		while(num>0){
			Sum =Sum+num % 10;
			num = num /10;
		}
		System.out.println ("Sum of digits in number : " + Sum);
	}
	public static void main(String[] args) {
		System.out.println("Welcome To The  Count Sum Of Digits in number");
		SumofDigits();
	}
}
