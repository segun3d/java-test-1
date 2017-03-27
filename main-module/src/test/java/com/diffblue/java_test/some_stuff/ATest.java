package com.diffblue.java_test.some_stuff;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import com.diffblue.java_testcase.Reflector;

public class ATest {

  @org.junit.Test
  public void com_diffblue_java_test_some_stuff_A_b8788df4bc6b7164_001() throws Exception {
    /* creating new object to test constructor */
    com.diffblue.java_test.some_stuff.A constructed;
    constructed = new com.diffblue.java_test.some_stuff.A();

    /* Method return type is void, or not expected to return */
  }

  @org.junit.Test
  public void com_diffblue_java_test_some_stuff_A_hasB_5640d077585fef9f_001() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.some_stuff.B tmp_object_factory$9 = (com.diffblue.java_test.some_stuff.B) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.B");
    Reflector.setInstanceField(tmp_object_factory$9, "x", 0);
    Reflector.setInstanceField(tmp_object_factory$9, "y", 0);
    com.diffblue.java_test.some_stuff.A tmp_object_factory$8 = (com.diffblue.java_test.some_stuff.A) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.A");
    Reflector.setInstanceField(tmp_object_factory$8, "b", tmp_object_factory$9);

    /* call function under test */
    boolean retval;
    retval = tmp_object_factory$8.hasB();

    /* check return value */
    assertEquals(retval, true);
  }

  @org.junit.Test
  public void com_diffblue_java_test_some_stuff_A_setB_a8c5083bcec1b60_001() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.some_stuff.B tmp_object_factory$9 = (com.diffblue.java_test.some_stuff.B) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.B");
    Reflector.setInstanceField(tmp_object_factory$9, "x", 0);
    Reflector.setInstanceField(tmp_object_factory$9, "y", 0);
    com.diffblue.java_test.some_stuff.A tmp_object_factory$8 = (com.diffblue.java_test.some_stuff.A) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.A");
    Reflector.setInstanceField(tmp_object_factory$8, "b", tmp_object_factory$9);
    com.diffblue.java_test.some_stuff.B b = null;

    /* call function under test */
    boolean retval;
    retval = tmp_object_factory$8.setB(b);

    /* check return value */
    assertEquals(retval, true);
  }
}
