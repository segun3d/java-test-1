package com.diffblue.javatest;

import com.diffblue.javatest.nestedobjects.subpackage.Order;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {
  @Test
  public void hasItem() {
    Order order = new Order();
    boolean result = order.hasItem();
    Assert.assertEquals(result, false);
  }
}
