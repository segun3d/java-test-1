package com.diffblue.javatest;

import org.junit.Assert;
import org.junit.Test;

public class SomeStuffTest {
  @Test
  public void hasB0() {
    com.diffblue.javatest.somestuff.A a = new com.diffblue.javatest.somestuff.A();
    boolean r = a.hasB();
    Assert.assertEquals(r, false);
  }
}
