package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Scramblies {

	public static boolean scramble(String str1, String str2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		List<Integer> value1 = new ArrayList<>();
		List<Integer> value2 = new ArrayList<>();
		boolean flag = true;

		for (Character character : str1.toCharArray()) {
			value1.add(map.put(character, map.getOrDefault(character, 0) + 1));
		}
		for (Character character : str2.toCharArray()) {
			value2.add(map.put(character, map.getOrDefault(character, 0) - 1));
		}

		System.out.println(map);
		System.out.println(value1);
		System.out.println(value2);
		return true;
		// return set1.containsAll(set2);
	}

	public static boolean scramble1(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		char[] c3 = new char[c2.length];

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (c2.length > c1.length)
			return false;

		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c2[i] == c1[j])
					c2[i] = (char) (c2[i] - 'a');
			}
		}

		return Arrays.equals(c2, c1);
	}

	public static void main(String[] args) {
		System.out.println(scramble("aabc", "abc"));
	}

	/*
	 * for (Character character : str2.toCharArray()) { map2.put(character,
	 * map2.getOrDefault(character, 0) + 1); }
	 * 
	 * Map<Object, Object> resultMap = map2.entrySet().stream()
	 * .collect(Collectors.toMap(e -> e.getKey(), e ->
	 * e.getValue().equals(map1.getOrDefault(e.getKey(), 0))));
	 * 
	 * Map<Object, Object> resultMap1 = map2.entrySet().stream()
	 * .collect(Collectors.toMap(e -> e.getKey(), e ->
	 * e.getValue().equals(map1.getOrDefault(e.getKey(), 0))));
	 */

	// Set<Object> val = resultMap.entrySet().stream().map(map ->
	// map.getValue()).collect(Collectors.toSet());
}
