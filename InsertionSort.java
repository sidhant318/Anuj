package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {5,6,4,2,9,7,1};
		print(arr);
		sort(arr);
		System.out.println();
		print(arr);

	}
	private static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}
	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
}
