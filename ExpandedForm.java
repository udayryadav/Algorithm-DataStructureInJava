package com.codewars;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface ExpandedForm {

	public static String expandedForm(int num) {
		String result = "";
		getDigits(num);
		return result;

	}

	
	public static List<Integer> getDigits(int value) {
		NumberFormat format = NumberFormat.getNumberInstance();
		
		StringBuilder sb = new StringBuilder(format.format(value));
				
        ArrayList<Integer> digits = new ArrayList<Integer>();
        if (value == 0) {
            digits.add(0);
        } else {
            while (value > 0) {
                digits.add(0, value % 10);
                value /= 10;
            }
        }
        return digits;
    }

	public static void main(String[] args) {
		System.out.println(expandedForm(402));
		// [4, 70300, 0, 7030, 3, 700, 0, 70]
	}
}
