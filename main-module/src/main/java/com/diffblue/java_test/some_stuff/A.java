package com.diffblue.java_test.some_stuff;

public class A {
  public B b;

  public boolean hasB() {
    if (b == null) {
      return false;
    } else {
      return true;
    }
  }
  public boolean setB(B b) {
    boolean exists = hasB();
    this.b = b;
    if (exists) {
      System.out.println("replaced B");
    }
    return exists;
  }
}
