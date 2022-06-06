package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {5,6,4,2,9,7,1};
		print(arr);
		sort(arr);
		System.out.println();
		print(arr);
	}
	
	private static void sort(int[] arr) {
		sort(arr,0,arr.length-1);
		
	}

	private static void sort(int[] arr, int left, int right) {
		if(left<right) {
			int pivot=pivot(arr,left,right);
			sort(arr,left,pivot-1);
			sort(arr,pivot+1,right);
		}
		
	}
// 1 5 8 2 4
	private static int pivot(int[] arr, int left, int right) {
		int index=left;
		for(int i=left;i<=right;i++) {
			if(arr[i]<arr[right]) {
				int tmp=arr[i];
				arr[i]=arr[index];
				arr[index]=tmp;
				index++;
			}
		}
		int tmp=arr[right];
		arr[right]=arr[index];
		arr[index]=tmp;
		return index;
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
