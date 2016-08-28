package com.diffblue.java_test;

import org.junit.*;

public class CalcTest
{

@Test
public void div0()
{
  int r=new Calc().div(2,1);
  Assert.assertEquals(r,2);
}

}
