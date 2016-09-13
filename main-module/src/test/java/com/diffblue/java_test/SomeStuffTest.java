package com.diffblue.java_test;

import org.junit.*;

public class SomeStuffTest
{

@Test
public void hasB0()
{
  com.diffblue.java_test.some_stuff.A a = new com.diffblue.java_test.some_stuff.A();
  boolean r = a.hasB();
  Assert.assertEquals(r,false);
}

}
