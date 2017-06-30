package org.jacoco.test.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd () {
		int  res = Calculator.add(2, 4);
		assertEquals(res, 6);
	}
	
	@Test
	public void testDivide () {
		int res = Calculator.divide(8, 0);
		assertEquals(res, 0);
	}
}
