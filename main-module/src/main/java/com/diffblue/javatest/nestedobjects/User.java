package com.diffblue.javatest.nestedobjects;

import com.diffblue.javatest.nestedobjects.subpackage.Item;
import com.diffblue.javatest.nestedobjects.subpackage.Order;

public class User {
  public User(Order order)  {
    this.order = order;
  }

  public boolean checkItemCost(Item item) {
    if (!order.hasItem()) {
      return false;
    }
    return order.item.cost == item.cost;
  }

  private Order order;
}
