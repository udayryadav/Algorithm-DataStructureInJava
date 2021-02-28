package com.codewars;

import java.util.Arrays;
import java.util.TreeSet;

public interface MinMax {

	public static int[] minMax(int[] arr) {
		int[] result = new int[2];
		TreeSet<Integer> resultSet = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			resultSet.add(arr[i]);
		}
		result[0] = resultSet.first();
		result[1] = resultSet.last();
		return result;
	}

	public static int[] minMax1(int[] arr) {
		Arrays.sort(arr);
		return new int[] { arr[0], arr[arr.length - 1] };
	}

	public static int[] minMax2(int[] arr) {
		return new int[] { Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt() };
	}

	public static void main(String[] args) {
		System.out.println(minMax1(new int[] { 1, 2, 3, 7, 4, 5 }));
	}

}
