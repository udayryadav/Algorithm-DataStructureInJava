package com.codewars;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public interface ConsonantValue {

	public static void solve(final String s) {
		char[] values = s.toCharArray();
		int sum = 0;
		Map<Character, Integer> map = new TreeMap<>(Collections.reverseOrder());
		Set<Integer> resultSet = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < s.length(); i++) {
			if(values[i] == 'a' || values[i] == 'e' || values[i] == 'i' || values[i] == 'o' || values[i] == 'u' ) {
				resultSet.add(sum);
				sum = 0;
			} else {
				map.put(values[i], map.getOrDefault(values[i], (values[i] - 'a') + 1));
				sum += map.get(values[i]);
			}
		}
		resultSet.add(sum);
		System.out.println(resultSet.iterator().next());
		System.out.println(resultSet);
    }
	
	public static void main(String[] args) {
		/*
		 * System.out.println("zodiacs  Syllables " +
		 * "zodiacs".replaceAll("(?<=[aeiou])", ""));
		 */
		solve("zodiacs");
	}
}
