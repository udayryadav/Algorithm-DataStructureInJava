package com.codewars;

import java.util.SortedSet;
import java.util.TreeSet;

public interface TwoToOne {

	public static String longest(String a, String b) {
		SortedSet<Character> result = new TreeSet<Character>();
		for (int i = 0; i < a.length(); i++) {
			result.add(a.charAt(i));
		}
		
		for (int i = 0; i < b.length(); i++) {
			result.add(b.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character character : result) {
		sb.append(character);	
		}
		
		return sb.toString();
	}

	public static String longest_1(String a, String b) {
		
		StringBuilder sb = new StringBuilder();
		(a+ b).chars().distinct().sorted().forEach(c -> sb.append((char)c));
		return sb.toString();
		
	}

	
	public static void main(String[] args) {
		System.out.println(longest_1("inmanylanguages", "theresapairoffunctions"));
	}

}
