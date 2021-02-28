package com.codewars;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Travel {

	String ad = "45 Holy Grail Al. Niagara Town ZP 32918,320 Main Al. Bern AE 56215,14 Gordon Park Atlanta RE 13200,"
			+ "100 Pussy Cat Rd. Chicago EX 34345,2 Gordon St. Atlanta RE 13222,5 Gordon Road Atlanta RE 13001,"
			+ "2200 Tokyo Av. Tedmondville SW 43198,67 Paris St. Abbeville AA 45522,11 Surta Avenue Goodville GG 30655,"
			+ "2222 Tokyo Av. Tedmondville SW 43198,670 Paris St. Abbeville AA 45522,114 Surta Avenue Goodville GG 30655,"
			+ "2 Holy Grail Street Niagara Town ZP 32908,3 Main Rd. Bern AE 56210,77 Gordon St. Atlanta RE 13000";

	String code = "OH 43071,NY 56432,ZP 32908,AE 56210,RE 13000,EX 34342,SW 43098,AA 45521,GG 30654,ZP 32908,AE 56215,RE 13200,EX 34345,"
			+ "RE 13222,RE 13001,SW 43198,AA 45522,GG 30655,XX 32321,YY 45098";

	class Address {
		static String zipCode;
		static String streetTown;
		static String houseNo;
	}

	public static void travel(String r, String zipcode) {
		// split the string basis of ,
		// store the string in sequence so that while fatching it will come in same
		// order, use linked list it will maintain the insertion order
		/*
		 * The function travel will take two parameters r (addresses' list of all
		 * clients' as a string) and zipcode and returns a string in the following
		 * format:
		 * 
		 * zipcode:street and town,street and town,.../house number,house number,...
		 * zipcode town street and number
		 * 
		 * The street numbers must be in the same order as the streets where they
		 * belong.
		 * 
		 * If a given zipcode doesn't exist in the list of clients' addresses return
		 * "zipcode:/"
		 * 
		 */
		StringBuilder sb = new StringBuilder();
		List<String> values = Stream.of(r.split(",")).map(String::trim).flatMap(s -> Stream.of(s)).collect(Collectors.toList());
		System.out.println(values);
		values.stream().map( l -> Stream.of(l.split("//s")).map(String::trim).flatMap(s -> Stream.of(s)));
		System.out.println("after" + values);
		
	}

	public static void main(String[] args) {
		travel(ad, "RE 13222");
	}
}
