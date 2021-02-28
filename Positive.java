package com.codewars;

import java.util.stream.IntStream;

public interface Positive {

	public static int sum(int[] arr) {
		return IntStream.of(arr).filter( i -> i > 0).sum();
		
	}

	public static void main(String[] args) {
		System.out.println(sum(new int[] {1,-2,3,4,5}));
		
	}
}
