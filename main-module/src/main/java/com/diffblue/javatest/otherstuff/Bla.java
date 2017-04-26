package com.diffblue.javatest.otherstuff;

public class Bla {
  public Bla(com.diffblue.javatest.somestuff.A a)  {
    this.m = a;
  }

  public boolean check(com.diffblue.javatest.somestuff.B b) {
    if (!m.hasB()) {
      return false;
    }
    if (m.b.x == b.x) {
      return true;
    }
    return false;
  }

  private com.diffblue.javatest.somestuff.A m;
}
