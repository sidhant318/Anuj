package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {2,4,1,3,5};//{5,6,4,2,9,7,1};
		print(arr);
		sort(arr);
		System.out.println();
		print(arr);
	}
	
	private static void sort(int[] arr) {
		sort(arr,0,arr.length-1,new int[arr.length]);
		
	}

	private static void sort(int[] arr, int i, int j, int[] ks) {
		if(i<j) {
			int mid=(i+j)/2;
			sort(arr,i,mid,ks);
			sort(arr,mid+1,j,ks);
			merge(arr,i,mid,j,ks);
		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right, int[] tmp) {
		int leftEnd=mid;
		int rightStart=mid+1;
		int size=(right-left)+1;
		int k=left;
		int leftStart=left;
		while(leftStart<=leftEnd && rightStart<=right) {
			if(arr[leftStart]<arr[rightStart]) {
				tmp[k]=arr[leftStart];
				k++;
				leftStart++;
			}
			else {
				tmp[k]=arr[rightStart];
				k++;
				rightStart++;
			}
		}
		while(leftStart<=leftEnd) {
			tmp[k]=arr[leftStart];
			k++;
			leftStart++;
		}
		while(rightStart<=right) {
			tmp[k]=arr[rightStart];
			k++;
			rightStart++;
		}
		System.arraycopy(tmp, left, arr, left, size);
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
