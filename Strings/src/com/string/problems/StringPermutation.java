package com.string.problems;

public class StringPermutation {

	public static void main(String[] args) {
		
		char[] chars= "abc".toCharArray();
		permutate(chars,0,chars.length-1);
	}

	private static void permutate(char[] chars, int start, int end) {
		if(start == end){
			for (int i = 0; i < chars.length; i++) {
				System.out.print(chars[i]);
			}
			System.out.println();
			return ;
		}
		for (int i = start; i <=end; i++) {
			swap(chars,start,i);
			permutate(chars,start+1, end);
			swap(chars,start,i);
		}
	}

	private static void swap(char[] chars, int start, int i) {	
		char temp = chars[start];
		chars[start] = chars[i];
		chars[i]=temp;
	}
}
