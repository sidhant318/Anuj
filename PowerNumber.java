package Math;

public class PowerNumber {

	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(fastPower(2, 4));
		System.out.println(sum(2, 4));
	}

	private static float sum(int a, int b) {
		if (b == 0)
			return 1;
		float tmp = sum(a, b / 2);
		if (b % 2 == 0) {
			return tmp * tmp ;
		} else {
			if(b>0)
				return tmp * tmp* a;
			else
				return (tmp*tmp)/a;
		}
	}

	private static int sum(int i) {
		if (i == 1)
			return 1;
		return i + sum(i - 1);
	}
	
	private static float fastPower(int a, int b) {
		float res = 1;
		while (b > 0) {
			if (b % 2 != 0) {
					res = res * a;
			}
			a = a * a;
			b = b / 2;
		}
		return res;
	}

//	private static float fastPower(int a, int b) {
//		float res = 1;
//		while (b != 0) {
//			if (b % 2 != 0) {
//				if(b>0)
//					res = res * a;
//				else
//					res=res/a;
//			}
//			a = a * a;
//			b = b / 2;
//		}
//		return res;
//	}

}
