package com.codewars;

public interface MakeNegative {

	
	 public static int makeNegative(final int x) {
		    
		    return x < 0 ? x : -x;
		    
		  }
	 
	 
	 public static void main(String[] args) {
		System.err.println(makeNegative(14));
	}
}
