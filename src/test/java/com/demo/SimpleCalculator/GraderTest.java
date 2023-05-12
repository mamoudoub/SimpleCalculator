package com.demo.SimpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {
	
	@Test
	public void negativeOneShouldReturnIllegalArgumentException() {
		//fail("Not yet implemented");
//        var grader = new Grader();
//		assertThrows(IllegalArgumentException.class,
//				() ->{
//					grader.determineLetterGrade(-1);
//				});
	}
	
	@Test
	public void zeroShouldReturnF() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('F', grader.determineLetterGrade(0));	
	}
	@Test
	public void fiftyNineShouldReturnF() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('F', grader.determineLetterGrade(59));	
	}
	
	@Test
	public void sixtyShouldReturnD() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('D', grader.determineLetterGrade(60));	
	}
	@Test
	public void sixtyNineShouldReturnD() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('D', grader.determineLetterGrade(69));	
	}
	
	@Test
	public void seventyShouldReturnC() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('C', grader.determineLetterGrade(70));
	}
	@Test
	public void seventyNineShouldReturnC() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('C', grader.determineLetterGrade(79));
	}

	@Test
	public void eightyShouldReturnB() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('B', grader.determineLetterGrade(80));
	}
	@Test
	public void eightyNineShouldReturnB() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('B', grader.determineLetterGrade(89));	
	}
	
	@Test
	public void ninetyShouldReturnA() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('A', grader.determineLetterGrade(90));
	}
	@Test
	public void ninetyNineShouldReturnA() {
		//fail("Not yet implemented");
		var grader = new Grader();
		assertEquals('A', grader.determineLetterGrade(99));
	}
}
