package com.arrays.sorting;

public class FindKthElement {

	public static void main(String[] args) {
		
		int numberArray []= {12,45,23,56,98,2,32,66,22,78,14};
		quickSort(numberArray, 0 , numberArray.length-1,6);
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]+ " ");
			
		}
		System.out.println();
		System.out.println(numberArray[6]);
		
	}

	private static void quickSort(int[] numberArray, int startIndex, int endIndex, int KthElement) {
		
		if(startIndex <endIndex){
			int pavoitIndex = partition(numberArray,startIndex,endIndex);
		//	if(KthElement < pavoitIndex)
			quickSort(numberArray, startIndex, pavoitIndex-1,KthElement);
			//else
			quickSort(numberArray, pavoitIndex+1 , endIndex, KthElement);
			
		}
		
	}

	private static int partition(int[] numberArray, int startIndex, int endIndex) {
		int pavoitElement = numberArray[endIndex];
		int pavoitIndex = startIndex;
		for (int i = startIndex ; i <=endIndex; i++) {
			if(numberArray[i] < pavoitElement){
				swap(numberArray , i ,pavoitIndex);
				pavoitIndex = pavoitIndex+1;
			}
		}
		
		if(numberArray[pavoitIndex]>numberArray[endIndex]){
			swap(numberArray,pavoitIndex,endIndex);
			return pavoitIndex;
		}else{
			return endIndex;
		}
		//return pavoitIndex;
	}

	private static void swap(int[] numberArray, int i, int pavoitIndex) {
		int temp = numberArray[i];
		numberArray[i] = numberArray[pavoitIndex];
		numberArray[pavoitIndex] = temp;
		
	}


	
}
