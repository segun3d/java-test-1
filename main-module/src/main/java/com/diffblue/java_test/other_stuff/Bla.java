package com.diffblue.java_test.other_stuff;

public class Bla
{
  public Bla(com.diffblue.java_test.some_stuff.A a)  {
    this.m=a;
  } 

  public boolean check(com.diffblue.java_test.some_stuff.B b) {
    if(!m.hasB())
      return false;
    if(m.b.x==b.x)
      return true;
    return false;
  }

  private com.diffblue.java_test.some_stuff.A m;
}
