package Array;

public class StockBuySellOne {

	public static void main(String[] args) {
		int[] arr= {3,1,4,8,7,2,5};
		System.out.println(findProfit(arr));
		System.out.println(findProfit1(arr));
	}

	private static int findProfit1(int[] arr) {
		int min=Integer.MAX_VALUE;
		int val=0;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			else {
				int tmp=arr[i]-min;
				if(tmp>val)
					val=tmp;
			}
		}
		return val;
	}

	private static int findProfit(int[] arr) {
		int[] tmp=new int[arr.length];
		int max=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
			}
			tmp[i]=max;
		}
		max=0;
		for(int i=0;i<arr.length;i++) {
			int val=tmp[i]-arr[i];
			if(val>max)
				max=val;
		}
		return max;
	}

}
