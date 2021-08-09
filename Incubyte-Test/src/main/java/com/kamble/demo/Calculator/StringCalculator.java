/**
 * 
 */
package com.kamble.demo.Calculator;

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

			sum += x;
		}

		return sum;
	}

	public int Add(String numbers) {

		if (numbers.isEmpty())
			return 0;

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
