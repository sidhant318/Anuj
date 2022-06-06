package Math;

import java.util.Arrays;

public class FindPrimeBetweenNumber {

	public static void main(String[] args) {
		int number=20;
		boolean[] primeNumber=prime(number);
		for(int i=0;i<=number;i++) {
			if(primeNumber[i])
				System.out.println(i);
		}
	}

//	private static boolean[] prime(int number) {
//		boolean[] b=new boolean[number+1];
//		Arrays.fill(b, true);
//		b[0]=false;
//		b[1]=false;
//		for(int i=2;i*i<=number;i++) {
//			for(int j=2*i;j<=number;j+=i) {
//				b[j]=false;
//			}
//		}
//		return b;
//	}
	
	private static boolean[] prime(int number) {
		boolean[] b=new boolean[number+1];
		Arrays.fill(b, true);
		b[0]=false;
		b[1]=false;
		for(int i=2;i*i<=number;i++) {
			for(int j=2*i;j<=number;j+=i) {
				b[j]=false;
			}
		}
		return b;
	}

}
