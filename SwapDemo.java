package BitWise;

public class SwapDemo {
	
	/*xor
	 * 0 0 = 0
	 * 1 0 = 1
	 * 0 1 = 1
	 * 1 1 = 0
	 * */

	public static void main(String[] args) {
		int a=2;
		int b=3;
		add(a,b);
	}

	private static void add(int i, int j) {
		System.out.println(i+" "+j);
		i=i^j; 
		j=i^j;
		i=i^j;
		System.out.println(i+" "+j);
	}
	
	/*or
	 * 0 0 = 0
	 * 1 0 = 1
	 * 0 1 = 1
	 * 1 1 = 1
	 * */
	
	/*AND
	 * 0 0 = 0
	 * 1 0 = 0
	 * 0 1 = 0
	 * 1 1 = 1
	 * */

}


