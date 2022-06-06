package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,6,4,2,9,7,1};
		print(arr);
		sort(arr);
		System.out.println();
		print(arr);
	}
	
	private static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int tmp=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<tmp) {
					int val=arr[j];
					arr[j]=tmp;
					tmp=val;
				}
			}
			arr[i]=tmp;
		}
		
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
