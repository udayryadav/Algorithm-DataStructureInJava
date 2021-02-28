package com.codewars;

public class WhoLikesIt {

	public static String whoLikesIt(String... names) {
		
		switch (names.length) {
		case 0:
			return "no one likes this";
		case 1:
			return names[0] + " likes this";
		case 2:
			return names[0] + " and " + names[1] + " likes this";
		case 3:
			return names[0] + ", " + names[1] + " and " + names[3] + " likes this";
		default:
			return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others likes this";
		}
		
		
	}

	/*
	 * if (names.length == 0)
			return "no one likes this";
		if (names.length == 1)
			return names[0] + " likes this";
		if (names.length == 2)
			return names[0] + " and " + names[1] + " likes this";
		if (names.length == 3)
			return names[0] + ", " + names[1] + " and " + names[3] + " likes this";
		if (names.length >= 4)
			return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others likes this";

		return "";
		
	 */
	public static void main(String[] args) {

		System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Max"));
	}

}
