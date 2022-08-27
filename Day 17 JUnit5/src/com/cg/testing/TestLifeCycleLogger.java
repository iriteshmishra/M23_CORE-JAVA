package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger 
{
	@Test
	default void testmethod()
	{
		System.out.println("Test Method");
	}
	@BeforeAll  
	default void beforeAllTests()
    {
    	System.out.println("Before All test");
    }
}
