package Recursion;

public class PowerSetOfString {

	public static void main(String[] args) {
		findPower("ABC",0,"");

	}

	private static void findPower(String str,int i,String ch) {
		if(i==str.length()) {
			System.out.println(ch);
			return;
		}
		findPower(str, i+1, ch+str.charAt(i));
		findPower(str, i+1, ch);
	}

}

