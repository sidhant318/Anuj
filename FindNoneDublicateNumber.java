package BitWise;

public class FindNoneDublicateNumber {

	public static void main(String[] args) {
		int arr[] = {3,2,5,8,5,8,3};
		System.out.println(findNumber(arr));
	}

	private static int findNumber(int[] arr) {
		int num=0;
		for(int i=0;i<arr.length;i++) {
			num=num^arr[i];
		}
		return num;
	}

}
