package com.demo.SimpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void twoPlusTwoShouldEqualFour() {
	//	fail("Not yet implemented");
		var calculator = new SimpleCalculator();
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void threePlusSevenShouldEqualTen() {
	//	fail("Not yet implemented");
		var calculator = new SimpleCalculator();
		assertEquals(10, calculator.add(3, 7));
	}
}
