package com.codewars;

import java.util.HashSet;
import java.util.Set;

public interface Isogram {

	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		return str.length() == set.size();
	}
	
	 public static boolean isIsogram1(String str) {
	        return str.toLowerCase()
	                  .chars()
	                  .distinct()
	                  .count() == str.length();
	    }

	public static void main(String[] args) {
		System.err.println(isIsogram("moOse"));
	}
}
