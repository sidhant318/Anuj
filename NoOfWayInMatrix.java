package Recursion;

public class NoOfWayInMatrix {

	public static void main(String[] args) {
		
		System.out.println(count(3,3));

	}

	private static int count(int a, int b) {
		if(a==1 || b==1)
			return 1;
		return count(a-1,b)+count(a,b-1);
	}

}
