package com.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class School {

	public static int getAverage(int[] marks) {
		return (int) (IntStream.of(marks).sum() / IntStream.of(marks).count());
	}
	
	public static int getAverage1(int[] marks) {
		return (int) Arrays.stream(marks).average().getAsDouble();
	}

	public static void main(String[] args) {
		System.out.println(getAverage1(new int[] {1,2,3,4,5}));
	}

}
