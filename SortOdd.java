package com.codewars;

import java.util.stream.IntStream;

public interface SortOdd {

	public static int[] sortArray(int[] array) {
		IntStream intStream = IntStream.of(array);
		//intStream.mapToObj(Integer::praseInt).
		return array;
	}

	public static void main(String[] args) {
		sortArray(new int[]{ 1, 3, 2, 8, 5, 4});
	}
}
