package com.diffblue.java_test;

import static org.junit.Assert.assertEquals;

import com.diffblue.java_testcase.Reflector;

public class AdditionsTest {

  /*
   * This test case reaches the following goals: function
   * java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block
   * 21 com/diffblue/java_test/Additions.java:41 function
   * java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block
   * 22 com/diffblue/java_test/Additions.java:42 function
   * java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block
   * 23 com/diffblue/java_test/Additions.java:43 function
   * java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block
   * 24 com/diffblue/java_test/Additions.java:44
   */

  @org.junit.Test
  public void com_diffblue_java_test_Additions_checkTicTacToePosition_100504ff5d66aea9_002() throws Exception {
    /* initialize test parameters */
    Additions tmp_object_factory$26 = (Additions) Reflector.forceInstance("com.diffblue.java_test.Additions");
    byte[] dynamic_2_array = { 0, 1, 2, 0, 1, 2, 0, 1, 0 };
    byte[] dynamic_object1 = dynamic_2_array;
    byte[] a = dynamic_object1;

    /* call function under test */
    byte retval;
    retval = tmp_object_factory$26.checkTicTacToePosition(a);

    /* check return value */
    assertEquals(retval, (byte) 1);
  }

  /*
   * This test case reaches the following goals: function
   * java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block
   * 16 com/diffblue/java_test/Additions.java:35
   */

  @org.junit.Test
  public void com_diffblue_java_test_Additions_checkTicTacToePosition_100504ff5d66aea9_009() throws Exception {
    /* initialize test parameters */
    Additions tmp_object_factory$26 = (Additions) Reflector.forceInstance("com.diffblue.java_test.Additions");
    byte[] dynamic_2_array = { 0, 2, 0, 0, 1, 1, 1, 1, 0 };
    byte[] dynamic_object1 = dynamic_2_array;
    byte[] a = dynamic_object1;

    /* call function under test */
    byte retval;
    retval = tmp_object_factory$26.checkTicTacToePosition(a);

    /* check return value */
    assertEquals(retval, (byte) -1);
  }

}
