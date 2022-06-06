package Math;

public class GCD {

	public static void main(String[] args) {
		/*
		 * gcd(b,a%b)
		 * */
		System.out.println(gcd(15,27));
	}

	private static int gcd(int i, int j) {
		if(j==0)
			return i;
		return gcd(j,i%j);
	}

}
