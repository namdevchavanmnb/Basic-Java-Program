package Com.BridgeLabz;

public class Fibonacciseries {
	public static void fibonacciseries() {

		int a=0,b=1;
		System.out.println(a+" "+b);

		int c;
		for(int i=1;i<=10;i++) {


			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the fibonacciseries");
		fibonacciseries();
	}
}

