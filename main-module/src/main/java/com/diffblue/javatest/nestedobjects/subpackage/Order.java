package com.diffblue.javatest.nestedobjects.subpackage;

public class Order {
  public Item item;

  public boolean hasItem() {
    if (item == null) {
      return false;
    } else {
      return true;
    }
  }

  public boolean setItem(Item item) {
    boolean exists = hasItem();
    this.item = item;
    return exists;
  }
}
