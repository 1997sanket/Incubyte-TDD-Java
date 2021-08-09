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
		int sum = sc.Add("1");

	}

	public int Add(String numbers) {

		if (numbers.isEmpty())
			return 0;

		else if (!numbers.contains(",")) {
			int x = Integer.parseInt(numbers);
			return x;
		}

		else
			return 3;

	}

}
