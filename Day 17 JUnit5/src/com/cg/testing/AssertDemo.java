package com.cg.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo {
//@test notation is important to perform unit testing
	@Test 
	public void display()
	{
		int result=6;
		int expected=6;
		/*It will check the value is equal or not, if it is equal no 
		failures otherwise you will get failure in testing*/
		assertEquals(result,expected);
	}

}
