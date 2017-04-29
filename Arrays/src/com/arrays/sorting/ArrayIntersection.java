package com.arrays.sorting;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		int arr[] ={3,5,7,8,21,45,67};
		int arr1[] ={2,4,6,8,21,44};
		
		int arrIndex =0;
		int arr1Index =0;
		boolean loopCheck = Boolean.TRUE;
		boolean loopCheck1 = Boolean.TRUE;
		List<Integer> union = new ArrayList<Integer>();
		List<Integer> intersection = new ArrayList<Integer>();
		
		while(true){
			if(!loopCheck && !loopCheck1){
				break;
			}
			int temp =0;
			int temp1 =0;
			if(arrIndex < arr.length ){
				temp = arr[arrIndex];
			}
			
			if(arr1Index < arr1.length ){
				temp1 = arr1[arr1Index];
			}
			
			if(loopCheck && loopCheck1){
				if(temp < temp1){
					union.add(temp);
					arrIndex++;
				}else if( temp1< temp){
					union.add(temp1);
					arr1Index++;
				}else{
					intersection.add(temp1);
					arrIndex++; arr1Index++;
				}
			}else if(loopCheck){
				union.add(temp);
				arrIndex++;
			}else if(loopCheck1){
				union.add(temp1);
				arr1Index++;
			}
			if(arrIndex == arr.length ){
				loopCheck = Boolean.FALSE;
			}
			if(arr1Index == arr1.length ){
				loopCheck1 = Boolean.FALSE;
			}
		}
		System.out.println("Union :: "+union);
		System.out.println("Intersection :: "+ intersection);
	}
}
