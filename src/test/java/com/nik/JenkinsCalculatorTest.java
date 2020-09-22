package com.nik;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void testAdd() {
		JenkinsCalculator jn = new JenkinsCalculator();
		assertEquals(10,  jn.add(5, 5));
	}

	@Test
	public void testSubtract() {
		JenkinsCalculator jn = new JenkinsCalculator();
		assertEquals(5,  jn.subtract(10, 5));
	}

}
