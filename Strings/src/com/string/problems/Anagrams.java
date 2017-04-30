package com.string.problems;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		char[] str1 = "sadasdasd".toCharArray();
		char[] str2 = "sdaasadds".toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]+" ");
		}
		System.out.println(Arrays.equals(str1, str2));
	}
}
