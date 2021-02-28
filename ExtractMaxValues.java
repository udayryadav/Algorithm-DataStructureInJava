package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class ExtractMaxValues {

	public static void extractMaxNoFromString(String s) {
		String[] retrive = s.split("//s");
		String numberString = s.replaceAll("[^A-Za-z]", "");
		String[] numbers = numberString.split("//d");
		Map<Integer, String> map = new HashMap<>();
		for (String str : numbers) {
			if (!map.containsKey(Integer.parseInt(str))) {
				map.put(Integer.parseInt(str), retrive[Integer.parseInt(str)]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
