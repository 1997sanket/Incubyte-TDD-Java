
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

	@Test
	public void Test_when_String_has_2_numbers() {
		Assert.assertEquals(6, sc.Add("1,2,3"));
	}

	@Test
	public void Test_when_String_has_backSlashN_insteadOfCommas() {
		
		Assert.assertEquals(6, sc.Add("1\n2,3"));
	}

	@Test(expected = RuntimeException.class)
	public void Test_when_String_has_negative_number() {

		Assert.assertEquals(-1, sc.Add("-1"));
	}
}
