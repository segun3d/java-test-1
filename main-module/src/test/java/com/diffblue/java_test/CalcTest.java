package com.diffblue.java_test;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import com.diffblue.java_testcase.Reflector;

public class CalcTest {

  @Test
  public void div0() {
    int r = new Calc().div(2, 1);
    Assert.assertEquals(r, 2);
  }

  @org.junit.Test
  public void com_diffblue_java_test_Calc_33b7f5f834dffc6e_001() throws Exception {
    /* creating new object to test constructor */
    com.diffblue.java_test.Calc constructed;
    constructed = new com.diffblue.java_test.Calc();

    /* Method return type is void, or not expected to return */
  }

  @org.junit.Test
  public void com_diffblue_java_test_Calc_div_9c3a619985e180c3_001() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.Calc tmp_object_factory$26 = (com.diffblue.java_test.Calc) Reflector
        .forceInstance("com.diffblue.java_test.Calc");
    int a = 1;
    int b = 3;

    /* call function under test */
    int retval;
    retval = tmp_object_factory$26.div(a, b);

    /* check return value */
    assertEquals(retval, 0);
  }
}
