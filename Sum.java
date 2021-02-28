package com.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public interface Sum {

	public static int GetSum(int a, int b) {
		List<Integer> sum = new ArrayList<>();
		if (a == b) {
			return a;
		}
		for (int i = a; i <= b; i++) {
			sum.add(i);
		}
		for (int i = a; i >= b; i--) {
			sum.add(i);
		}
		return sum.stream().mapToInt(Integer::intValue).sum();
	}

	public static int GetSum1(int a, int b) {
		int res = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			res += i;
		}
		return a == b ? a : res;
	}
	
	public static int getSum2(int a, int b) {
		return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();	
	}

	public static void main(String[] args) {
		System.out.println(getSum2(0, -1));
		
	}

}
