package com.diffblue.javatest;

import com.diffblue.javatest.somestuff.A;
import org.junit.Assert;
import org.junit.Test;

public class SomeStuffTest {
  @Test
  public void hasB0() {
    A a = new A();
    boolean r = a.hasB();
    Assert.assertEquals(r, false);
  }
}
