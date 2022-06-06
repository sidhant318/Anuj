package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,6,4,2,9,7,1};
		print(arr);
		sort(arr);
		System.out.println();
		print(arr);
	}

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
