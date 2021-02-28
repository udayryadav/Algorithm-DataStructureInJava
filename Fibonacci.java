package com.codewars;

/* Java program for Memoized version */
public interface Fibonacci {

	static int database[] = new int[100];

	static int fib(int n) {
		// base case
		if (n <= 1)
			return n;

		// if fib(n) has already
		// been computed we do not
		// do further recursive
		// calls and hence reduce
		// the number of repeated
		// work
		if (database[n] != 0)
			return database[n];

		else {

			// store the computed value
			// of fib(n) in an array
			// term at index n to so that
			// it does not needs to be
			// precomputed again
			database[n] = fib(n - 1) + fib(n - 2);

			return database[n];
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci number is " + fib(-3));
	}

}
