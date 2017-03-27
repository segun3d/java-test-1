package com.diffblue.java_test.other_stuff;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import com.diffblue.java_testcase.Reflector;

public class BlaTest {

  @org.junit.Test
  public void com_diffblue_java_test_other_stuff_Bla_93f85c88eb45c58c_001() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.some_stuff.A a = null;

    /* creating new object to test constructor */
    com.diffblue.java_test.other_stuff.Bla constructed;
    constructed = new com.diffblue.java_test.other_stuff.Bla(a);

    /* Method return type is void, or not expected to return */
  }

  @org.junit.Test
  public void com_diffblue_java_test_other_stuff_Bla_check_134354ac15cb053c_001() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.some_stuff.B tmp_object_factory$6 = (com.diffblue.java_test.some_stuff.B) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.B");
    Reflector.setInstanceField(tmp_object_factory$6, "x", 0);
    com.diffblue.java_test.some_stuff.A tmp_object_factory$5 = (com.diffblue.java_test.some_stuff.A) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.A");
    Reflector.setInstanceField(tmp_object_factory$5, "b", tmp_object_factory$6);
    com.diffblue.java_test.other_stuff.Bla tmp_object_factory$4 = (com.diffblue.java_test.other_stuff.Bla) Reflector
        .forceInstance("com.diffblue.java_test.other_stuff.Bla");
    Reflector.setInstanceField(tmp_object_factory$4, "m", tmp_object_factory$5);
    com.diffblue.java_test.some_stuff.B tmp_object_factory$9 = (com.diffblue.java_test.some_stuff.B) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.B");
    Reflector.setInstanceField(tmp_object_factory$9, "x", 0);
    com.diffblue.java_test.some_stuff.B b = tmp_object_factory$9;

    /* call function under test */
    boolean retval;
    retval = tmp_object_factory$4.check(b);

    /* check return value */
    assertEquals(retval, true);
  }

  @org.junit.Test
  public void com_diffblue_java_test_other_stuff_Bla_check_134354ac15cb053c_002() throws Exception {
    /* initialize test parameters */
    com.diffblue.java_test.some_stuff.B tmp_object_factory$6 = (com.diffblue.java_test.some_stuff.B) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.B");
    Reflector.setInstanceField(tmp_object_factory$6, "x", 0);
    com.diffblue.java_test.some_stuff.A tmp_object_factory$5 = (com.diffblue.java_test.some_stuff.A) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.A");
    Reflector.setInstanceField(tmp_object_factory$5, "b", tmp_object_factory$6);
    com.diffblue.java_test.other_stuff.Bla tmp_object_factory$4 = (com.diffblue.java_test.other_stuff.Bla) Reflector
        .forceInstance("com.diffblue.java_test.other_stuff.Bla");
    Reflector.setInstanceField(tmp_object_factory$4, "m", tmp_object_factory$5);
    com.diffblue.java_test.some_stuff.B tmp_object_factory$9 = (com.diffblue.java_test.some_stuff.B) Reflector
        .forceInstance("com.diffblue.java_test.some_stuff.B");
    Reflector.setInstanceField(tmp_object_factory$9, "x", 268435456);
    com.diffblue.java_test.some_stuff.B b = tmp_object_factory$9;

    /* call function under test */
    boolean retval;
    retval = tmp_object_factory$4.check(b);

    /* check return value */
    assertEquals(retval, false);
  }
}
