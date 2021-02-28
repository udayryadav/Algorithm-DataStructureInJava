package com.codewars;

import java.util.stream.IntStream;

public interface SequenceSum {

	public static String showSequence(int value) {

		if (value < 0) {
			return value + "<0";
		}
		if (value == 0) {
			return "0=0";
		}
		StringBuilder sb = new StringBuilder("0");
		IntStream.range(1, value + 1).forEach(i -> {
			sb.append("+" + i);
		});

		return sb + " = " + (value * (value + 1) / 2);
	}

	public static int sum(int value) {
		return value * (value + 1) / 2;
	}

	public static void main(String[] args) {
		System.out.println(showSequence(6));
	}
}
