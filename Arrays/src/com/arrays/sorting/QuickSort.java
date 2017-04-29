package com.arrays.sorting;

public class QuickSort {

	public static void main(String[] args) {
		//int arr[] = {7,5,1,6,8,2,2,3,4};//{2,14,45,1,4,56,20,33,90};
		int arr[] = {6,7,7,7,7,7};
		System.out.println("Input");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Output");
		quickSort(arr, 0, arr.length-1,6);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void quickSort(int arr[],int start, int end, int k){
		if(start < end){
			
			int pIndex = partition(arr,start,end);
			quickSort(arr, start, pIndex-1,k);
			quickSort(arr, pIndex +1, end,k);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivotElement =arr[end];
		int pIndex=start;
		for (int i = start; i <= end-1; i++) {
			if(arr[i] <= pivotElement){
				swap(arr, i,pIndex);
				pIndex = pIndex + 1;
			}
		}
		if(arr[pIndex]>arr[end]){
			swap(arr,pIndex,end);
			return pIndex;
		}else{
			return end;
		}
	}

	private static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
