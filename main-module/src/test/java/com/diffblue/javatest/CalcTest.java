package com.diffblue.javatest;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
  @Test
  public void divideByOne() {
    int result = new Calc().div(2, 1);
    Assert.assertEquals(result, 2);
  }
}
