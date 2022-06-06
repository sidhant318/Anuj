package Recursion;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println(findPalindrom("racecar"));

	}

	private static boolean findPalindrom(String str) {
		return findPalindrom(str,0,str.length()-1);
	}

	private static boolean findPalindrom(String str, int i, int j) {
		if(i>=j)
			return true;
		if(str.charAt(i)!=str.charAt(j))
			return false;
		return findPalindrom(str,i+1,j-1);
	}

}
