package com.codewars;

import java.util.Arrays;

public interface UnwantedDollars {

	// method to check if string have $ sing in it 
	public static boolean containsDollars(String str) {
		if(str.contains("$")) return true;
		return false;
	}
	
	public static void process(String str) {
		if(containsDollars(str)) str.replace("$", "");
		str.trim();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		process("-$ 0.1");
	}
}
