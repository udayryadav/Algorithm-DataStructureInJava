package com.codewars;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class UniqueNumber {

	public static double findUniq(double arr[]) {
		Map<Double, Integer> map = new HashMap<>();
		for (double d : arr) {
			map.put(d, map.getOrDefault(d, 0) + 1);
		}
		for (Map.Entry<Double, Integer> keys : map.entrySet()) {
			if (keys.getValue() == 1)
				return keys.getKey();
		}
		return 1;
	}

	public static double findUnique(double arr[]) {
		Map<Double, List<Double>> collect = DoubleStream.of(arr).boxed()
				.collect(Collectors.groupingBy(Double::valueOf));
		System.out.println(collect);
		return 1.0;
	}

	public static void main(String[] args) {

		System.out.println(findUnique(new double[] { 1, 1, 1, 2, 1, 1 }));
	}

}
