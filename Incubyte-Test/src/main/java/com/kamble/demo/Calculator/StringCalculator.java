/**
 * 
 */
package com.kamble.demo.Calculator;

import java.util.Arrays;

/**
 * @author Sanket Kamble
 *
 */
public class StringCalculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringCalculator sc = new StringCalculator();
		int sum = sc.Add("1\n2,3");
		// System.out.println(sum);

	}

	private static int sum(String[] numbers) {

		int sum = 0;

		for (String s : numbers) {
			int x = Integer.parseInt(s);

			if (x < 0)
				throw new RuntimeException("negatives not allowed");

			if (x > 1000)
				continue;

			sum += x;
		}

		return sum;
	}

	public int Add(String numbers) {

		if (numbers.isEmpty())
			return 0;

		else if (numbers.contains("//")) {

			StringBuilder s = new StringBuilder("");

			int i = 2;
			while (!Character.toString(numbers.charAt(i)).equals("\n")) {
				s.append(numbers.charAt(i++));

			}

			System.out.println("Delimiter : " + s);

			System.out.println(i);

			String s1 = numbers.substring(i + 1);
			System.out.println("s1 : " + s1);
			String[] separated = s1.split(new String(s));

			System.out.println("Final string : " + Arrays.toString(separated));

			return sum(separated);

			/*
			 * System.out.println(Arrays.toString(numbers.toCharArray()));
			 * 
			 * char c = numbers.charAt(2);
			 * 
			 * String s1 = numbers.substring(4);
			 * 
			 * System.out.println("After substring : " + s1); String[] separated =
			 * s1.split(Character.toString(c));
			 * 
			 * return sum(separated);
			 */
		}

		else if (!numbers.contains(",") && !numbers.contains("\n")) {
			int x = Integer.parseInt(numbers);

			if (x < 0)
				throw new RuntimeException("negatives not allowed");

			return x;
		}

		else if (numbers.contains(",") && numbers.contains("\n")) {

			// System.out.println("Printing as it is " + numbers);

			String s1 = numbers.replace("\n", ",");

			String[] separated = s1.split(",");

			return sum(separated);
		}

		else if (numbers.contains(",")) {

			// Removing commas
			String[] separatedNumbersFromCommas = numbers.split(",");

			return sum(separatedNumbersFromCommas);

		}

		else if (numbers.contains("\n")) {

			// Removing backSlashN
			String[] separated = numbers.split("\n");

			return sum(separated);
		}

		else
			return -1;

	}

}
