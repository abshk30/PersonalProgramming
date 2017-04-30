package com.string.problems;

import java.util.Scanner;

public class FindDublicateCharacter {

	public static void main(String[] args) {
		int []arr= new int[26];
		System.out.println("Enter the string value");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.next().toLowerCase();
		for (int i = 0; i < inputString.toCharArray().length; i++) {
			int index = inputString.charAt(i) - 'a';
			if(index >=0 && index <=25){
				arr[index]= arr[index]+1;
			}
		}
		System.out.println("dublicate characters are :");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>1){
				System.out.print((char)(i+((int)'a'))+" ");
			}
		}
		
	}
}
