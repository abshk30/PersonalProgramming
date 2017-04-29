package com.arrays.questions;

public class ArrangeAlternativePositiveAndNegative {

	public static void main(String[] args) {
		int arr[] = {-1,2,3,4,5,6,7,8,-3,-4,-5,-9,-6,-7,-8};
		int positiveIndex = 0 ;
		while(positiveIndex <arr.length){
			findNegativeIndex(arr , positiveIndex);
			positiveIndex ++;
			findPositiveIndex(arr , positiveIndex);
			positiveIndex ++;
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void findPositiveIndex(int[] arr, int positiveIndex) {
		for (int i = positiveIndex ; i < arr.length; i++) {
			if(arr[i] > 0){
				swap(arr, positiveIndex, i);
				break;
			}
		}
		
	}

	private static void findNegativeIndex(int[] arr, int negativeIndex) {
		for (int i = negativeIndex ; i < arr.length; i++) {
			if(arr[i] < 0){
				swap(arr, negativeIndex, i);
				break;
			}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
