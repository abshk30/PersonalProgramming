package com.arrays.questions;

public class Permutation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		permute(arr, 0, arr.length - 1);
	}

	private static void permute(int charArray[], int sIdx, int eIdx) {

		if (sIdx == eIdx) {
			for (int i = 0; i < charArray.length; i++) {
				System.out.print("" + charArray[i]);
			}
			System.out.println();
			return;
		}
		for (int i = sIdx; i <= eIdx; i++) {
			swap(charArray, sIdx, i);
			permute(charArray, sIdx + 1, eIdx);
			swap(charArray, sIdx, i);
		}
	}
	private static void swap(int[] charArray, int sIdx, int eIdx) {
		int temp = charArray[sIdx];
		charArray[sIdx] = charArray[eIdx];
		charArray[eIdx] = temp;
	}
}
