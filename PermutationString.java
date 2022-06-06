package Recursion;

public class PermutationString {

	public static void main(String[] args) {
		findPermutation("abc",0,2);

	}

	private static void findPermutation(String str,int left,int right) {
		if(left==right) {
			System.out.println(str);
			return;
		}
		for(int i=left;i<=right;i++) {
			str=swap(str,i,left);
			findPermutation(str,left+1,right);
			str=swap(str,i,left);
		}
	}

	private static String swap(String str, int i, int left) {
		StringBuilder s=new StringBuilder(str);
		s.setCharAt(i, str.charAt(left));
		s.setCharAt(left, str.charAt(i));
		return s.toString();
	}

}



