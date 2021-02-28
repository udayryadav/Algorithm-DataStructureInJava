package com.codewars;

import java.util.stream.IntStream;

public class SuperMarketQueue {

	public static int queueTime(int[] customers, int n) {
		int time  = 0;
		if (customers.length > 0) {
		if (n == 1) return time = IntStream.of(customers).sum();
			
		}
		return time;
	}
	
	public static void splitString(String str) {
		String[] values = str.split(";");
		for (String string : values) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		splitString("A,B;B,C;A,C;B,D;C,D;D,E;F,G;G,H;F,H");
		System.out.println(queueTime(new int[] { 5, 3, 4 }, 1));
		// should return 12
		// because when there is 1 till, the total time is just the sum of the times

		System.out.println(queueTime(new int[] { 10, 2, 3, 3 }, 2) );
		// should return 10
		// because here n=2 and the 2nd, 3rd, and 4th people in the
		// queue finish before the 1st person has finished.

		// queueTime(new int[] { 2, 3, 10 }, 2);
		// should return 12
	}
}
