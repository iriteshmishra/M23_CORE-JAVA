package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionFalse {
  @Test 
  void division()
  {
      System.setProperty("Ritesh", "Vishal");
      Assumptions.assumeFalse("Vishal".equals(System.getProperty("Rites")));
      System.out.println("Assumption is false");
  }
}  