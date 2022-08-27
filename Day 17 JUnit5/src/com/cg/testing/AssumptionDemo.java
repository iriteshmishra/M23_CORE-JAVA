package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
  @Test 
  void division()
  {
      System.setProperty("Ritesh", "Vishal");
      //If assumption is true then printing statement will print otherwise not
      Assumptions.assumeTrue("Vishal".equals(System.getProperty("Ritesh")));
      System.out.println("Assumption is true");
  }
}
