package Array;

public class KadensAlgo {

	public static void main(String[] args) {
		int[] arr= {5,-4,-2,6,-1};
		System.out.println(maxSum(arr));
	}

	private static int maxSum(int[] arr) {
		int sum=0;
		int result=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>result)
				result=sum;
			if(sum<0)
				sum=0;
		}
		return result;
	}

}
