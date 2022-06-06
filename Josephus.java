package Recursion;

public class Josephus {

	public static void main(String[] args) {
		System.out.println(find(3,3));

	}
	
	/*
	 * 		find relation between 4 and 3 original cirular seating by removing
	 * 		
	 * 
	 * 
	 * */

	private static int find(int n, int k) {
		if(n==1)
			return 0;
		return (find(n-1,k)+k)%n;
	}

}
