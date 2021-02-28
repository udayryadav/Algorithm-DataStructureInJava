package com.codewars;

import java.util.Stack;

public interface SquareDigit {

	public static int squareDigits(int n) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> tempResult = new Stack<Integer>();
		while (n > 0) {
			int lastDigit = n % 10;
			n = n / 10;
			tempResult.push(lastDigit * lastDigit);
		}

		while (tempResult.iterator().hasNext()) {
			sb.append(tempResult.pop());
		}
		
		return Integer.parseInt(sb.toString());
	}
	
	public static  int squareDigits1(int n) {
		 StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int lastDigit = n % 10;
			n = n / 10;
			sb.insert(0, lastDigit * lastDigit);
		}
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		System.out.println(squareDigits1(9119));
	}

}
