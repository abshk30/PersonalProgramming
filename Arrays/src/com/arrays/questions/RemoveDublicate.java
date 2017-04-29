package com.arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arrays size :: \n");
		int arraysSize = scan.nextInt();
		int[] arr = new int[arraysSize];
		System.out.println("\n\nEnter values :\n");
		for (int i = 0; i < arraysSize; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array before removing dublicate");
		for(int i = 0; i < arraysSize; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		int i =0 , j=1;
		while(j < arraysSize){
			if(arr[i] == arr[j]){
				j++;
			}else{
				arr[i+1]=arr[j];
				i++;
			}
		}
		for(int k = 0 ; k<=i ; k++){
			System.out.print(arr[k]+" ");
		}
	}
}
