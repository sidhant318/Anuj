package Math;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=121;
		int rev=reverse(num);
		if(num==rev) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

	private static int reverse(int num) {
		int result=0;
		while(num!=0) {
			int n=num%10;
			num=num/10;
			result=(result*10)+n;
		}
		return result;
	}

}
