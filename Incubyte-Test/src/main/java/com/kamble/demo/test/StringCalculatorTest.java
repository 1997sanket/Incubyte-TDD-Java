
package com.kamble.demo.test;

import org.junit.Assert;
import org.junit.Test;

import com.kamble.demo.Calculator.StringCalculator;


/**
 * @author Sanket Kamble
 *
 */
public class StringCalculatorTest {

	@Test
	public void Test_when_String_is_Empty() {

		StringCalculator sc = new StringCalculator();

		Assert.assertEquals(0, sc.Add(""));
	}
}
