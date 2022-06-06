package Math;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(findfact(10));
		System.out.println(trailigZeroInFact(10));
	}

	private static int trailigZeroInFact(int n) {
		int res=0;
		for(int i=5;i<=n;i=i*5) {
			res=res+(n/i);
		}
		return res;
	}

	private static int findfact(int i) {
		if (i == 1)
			return 1;
		return findfact(i - 1) * i;

	}

}
