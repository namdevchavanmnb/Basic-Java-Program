package Com.BridgeLabz;

public class palindromeornot {
	public static void palindrom() {

		int number = 121;
		int temp = number;
		int revers=0,remainder;
		while(temp!=0) {
			remainder=temp%10;
			revers=revers*10+remainder;
			temp=temp/10;
		}
		if(number==revers) {
			System.out.println(number+"is Palindrom number");
		}
		else {
			System.out.println(number+"is not palindrom number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Palindrom number");
		palindrom();
	}
}

