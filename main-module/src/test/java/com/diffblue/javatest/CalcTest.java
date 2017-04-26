package com.diffblue.javatest;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
  @Test
  public void div0() {
    int r = new Calc().div(2, 1);
    Assert.assertEquals(r, 2);
  }
}
