package com.codewars;

import java.util.StringJoiner;

public interface PigLatin {

	public static String pigIt(String str) {

		String[] tokens = str.split(" ");
		StringJoiner sb = new StringJoiner("ey");
		for (String str1 : tokens) {
			char[] s = str1.toCharArray();
			int startIndex = 0, endIndex = s.length;
			char firstValue = s[startIndex];
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.err.println(pigIt("Pig latin is cool"));
	}

}
