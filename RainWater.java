package Array;

public class RainWater {

	public static void main(String[] args) {
		int arr[]= {3,1,2,4,0,1,3,2};
		System.out.println(findMaxWater(arr));
	}

	private static int findMaxWater(int[] arr) {
		int tmp=0;
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>tmp)
				tmp=arr[i];
			left[i]=tmp;
		}
		tmp=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>tmp)
				tmp=arr[i];
			right[i]=tmp;
		}
		tmp=0;
		for(int i=1;i<arr.length-1;i++) {
			int val=Math.min(left[i], right[i])-arr[i];
			tmp+=val<0?0:val;
		}
		return tmp;
	}

}
