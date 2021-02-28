package com.codewars;

import java.util.Arrays;
import java.util.function.Function;

public class CamelCaseString {

	public static String camelCase(String s) {
		String camelCaseStr = "";
		Function<String, String> upperCaseFunction = upperCaseString -> {
			upperCaseString = upperCaseString.toLowerCase();
			String firstLetter = upperCaseString.substring(0, 1).toUpperCase();
			String remainingLetters = upperCaseString.substring(1, upperCaseString.length());
			return firstLetter + remainingLetters;
		};

		if (s.contains("_") || s.contains("-")) {
			String[] tokens = s.split("_|\\-");
			camelCaseStr = Arrays.asList(tokens).stream().map(upperCaseFunction).map(e -> e.toString()).reduce("",
					String::concat);
		}
		return camelCaseStr;
	}
	
	public static String maskString(String s) {
		
		if(s.length() > 5) {
		String lastFourChars = s.substring(s.length() - 4);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length() - 4; i++) {
			sb.append("*");
			
		}
		sb.append(lastFourChars);
		return sb.toString();
		}
		return s;
	}

	// Write a program to remove everything inside the parenthesis and parenthesis
	// itself.
	
	 
	public static void main(String[] args) {
	String[] tokens =	"saveChangesInTheEditor".split("(?=\\p{Upper})");
	int count  = (int) Arrays.stream(tokens).count();
	System.out.println("Count is " + count);
	for (String string : tokens) {
		System.out.println(string);
	}
	}
}
