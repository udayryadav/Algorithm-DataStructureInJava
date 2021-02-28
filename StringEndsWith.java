package com.codewars;

public class StringEndsWith {

	public static boolean stringEndsWith(String s1, String s2) {
		int lengthToCheck = s2.length();
		String strToCheck = s1.substring(s1.length() - lengthToCheck);
		return s2.equals(strToCheck);	
		
	}
	
	public static void main(String[] args) {
		System.out.println(stringEndsWith("abc", "d"));
	}
}
