package com.codewars;

public interface Troll {

	public static String disemvowel(String str) {
		
		return str.replaceAll("[AaEeIiOoUu]", "");

	}

	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL!"));
	}
}
