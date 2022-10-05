package Com.BridgeLabz;

public class PrimeorNot {
	static boolean checkPrimeNumber(int Num) {

		boolean isprime=true;
		for(int i=1;i<=Num; i++) {
			if(Num%i==0){
				isprime=false;
				break;

			}
		}
		return isprime;

	}

	public static void main(String[] args) {
		boolean b=checkPrimeNumber(23);
		if(b) {
			System.out.println("Prime Number");
		}else
			System.out.println("Not pime Number");

	}

}



