package com.diffblue.javatest.otherstuff;

import com.diffblue.javatest.somestuff.A;
import com.diffblue.javatest.somestuff.B;

public class Bla {
  public Bla(A a)  {
    this.m = a;
  }

  public boolean check(B b) {
    if (!m.hasB()) {
      return false;
    }
    if (m.b.x == b.x) {
      return true;
    }
    return false;
  }

  private A m;
}
