package com.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

public interface StringOrder {

	@Test
	public static void order(String s) {
		String[] retrive = s.split(" ");
		Map<Integer, String> map = new HashMap<>();
		int i = 0;
		for (String str : retrive) {
			char[] ch = str.toCharArray();
			for (Character c : ch) {
				if (Character.isDigit(c)) {
					int index = Integer.parseInt(String.valueOf(c));
					map.put(index, retrive[i++]);
				}
			}

		}
		System.out.println(map.values().stream().collect(Collectors.joining(" ")));
	}

	@Test
	public static void order1(String str) {
		Arrays.stream(str.split(" ")).sorted(Comparator.comparing(s -> s.replaceAll("\\D+", "")))
				.collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {
		order("4of Fo1r pe6ople g3ood th5e the2");
	}
}
