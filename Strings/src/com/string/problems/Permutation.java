package com.string.problems;

public class Permutation {

	public static void main(String[] args) {
		String str ="abc";
		
		char[] chars = str.toCharArray();
		permute(chars,0,str.length()-1);
	}

	private static void permute(char[] charArray, int startIndex, int endIndex) {
		
		if(startIndex == endIndex){
			
			for (int i = 0; i < charArray.length; i++) {
				System.out.print(charArray[i]+ " ");
			}
			System.out.println();
			return ;
		}
		for (int j = startIndex; j <= endIndex; j++) {
			swap(charArray, startIndex,j);
			permute(charArray, startIndex +1, endIndex);
			swap(charArray, startIndex, j);
		}
	
		
		
	}

	private static void swap(char[] charArray, int startIndex, int j) {
		char character= charArray[startIndex];
		charArray[startIndex]=charArray[j];
		charArray[j] = character;
		
	}
}
