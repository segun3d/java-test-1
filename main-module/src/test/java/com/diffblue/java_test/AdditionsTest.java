package com.diffblue.java_test;

import com.diffblue.java_testcase.*;
import static org.junit.Assert.assertEquals;

public class AdditionsTest {

  /* This test case reaches the following goals:
   * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 21
   *  com/diffblue/java_test/Additions.java:41
   * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 22
   *  com/diffblue/java_test/Additions.java:42
   * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 23
   *  com/diffblue/java_test/Additions.java:43
   * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 24
   *  com/diffblue/java_test/Additions.java:44
   */

  @org.junit.Test
  public void com_diffblue_java_test_Additions_checkTicTacToePosition_100504ff5d66aea9_002() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.Additions tmp_object_factory$26=(com.diffblue.java_test.Additions) Reflector.forceInstance("com.diffblue.java_test.Additions");
    byte [] dynamic_2_array=new byte []{ (byte)0, (byte)1, (byte)2, (byte)0, (byte)1, (byte)2, (byte)0, (byte)1, (byte)0 };
    byte [] dynamic_object1=(byte [])dynamic_2_array;
    byte [] a=(byte [])dynamic_object1;

    /* call function under test */
    byte retval;
    retval = tmp_object_factory$26.checkTicTacToePosition(a);

    /* check return value */
    assertEquals(retval, (byte)1);
  }

  /* This test case reaches the following goals:
   * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 16
   *  com/diffblue/java_test/Additions.java:35
   */

  @org.junit.Test
  public void com_diffblue_java_test_Additions_checkTicTacToePosition_100504ff5d66aea9_009() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.Additions tmp_object_factory$26=(com.diffblue.java_test.Additions) Reflector.forceInstance("com.diffblue.java_test.Additions");
    byte [] dynamic_2_array=new byte []{ (byte)0, (byte)2, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0 };
    byte [] dynamic_object1=(byte [])dynamic_2_array;
    byte [] a=(byte [])dynamic_object1;

    /* call function under test */
    byte retval;
    retval = tmp_object_factory$26.checkTicTacToePosition(a);

    /* check return value */
    assertEquals(retval, (byte)-1);
  }
}
