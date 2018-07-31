package com.arrays.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = {7,5,1,6,8,2,2,3};//{2,14,45,1,4,56,20,33,90};
		//int arr[] = { 6, 7, 7, 7, 7, 7 };
		System.out.println("Input");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sort(arr , 0, arr.length);
		System.out.println();
		System.out.println("Output");
		//mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void sort(int[] arr, int start, int end) {
		
		if( start < end ) {
			int mid = (start+ end) /2 ;
			sort(arr,start , mid);
			sort(arr,mid +1 , end);
			merge(arr,start,mid , end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		int n1 = mid - start +1  ;
		int n2 = end - mid;
		
		int arrLeft[] = new int[n1];
		int arrRight[] = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			arrLeft[i] = arr[start + i];
		}
		
		for (int i = 0; i < n2; i++) {
			arrRight[i] = arr[mid + 1 +i];
		}
		
		int i = 0 , j = 0 , k = start;
		
		while(i < n1 && j < n2) {
			
			if(arrLeft[i] < arrRight[j]) {
				arr[k] = arrLeft[i];
				i++;
			}else if(arrRight[i] == arrLeft[i]) {
				arr[k]= arrLeft[i];
			}else {
				arr[k] = arrRight[j];
				j++;
			}
		}
		
		 while (i < n1)
	        {
	            arr[k] = arrLeft[i];
	            i++;
	            k++;
	        }
	 
	        while (j < n2)
	        {
	            arr[k] = arrRight[j];
	            j++;
	            k++;
	        }
	}

}
