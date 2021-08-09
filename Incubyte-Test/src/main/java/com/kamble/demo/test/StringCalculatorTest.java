
package com.kamble.demo.test;

import org.junit.Assert;
import org.junit.Test;

import com.kamble.demo.Calculator.StringCalculator;


/**
 * @author Sanket Kamble
 *
 */
public class StringCalculatorTest {

	private StringCalculator sc = new StringCalculator();

	@Test
	public void Test_when_String_is_Empty() {

		Assert.assertEquals(0, sc.Add(""));
	}

	@Test
	public void Test_when_String_has_1_number() {

		Assert.assertEquals(2, sc.Add("2"));
	}
}
