package com.diffblue.javatest;

public class Validation {
  /**
   * Checks if an array contains a sequence
   * [... '<','h','t','m','l' ...]
   */
  @SuppressWarnings("checkstyle:fallthrough")
  public boolean containsUnsafeSequence(char[] ca) {
    int state = 0;
    for (int i = 0; i < ca.length; i++) {
      switch (state) {
        case 0:
          if (ca[i] == '<') {
            state = 1;
          } else {
            state = 0;
            break;
          }
        case 1:
          if (ca[i] == 'h') {
            state = 2;
          } else {
            state = 0;
            break;
          }
        case 2:
          if (ca[i] == 't') {
            state = 3;
          } else {
            state = 0;
            break;
          }
        case 3:
          if (ca[i] == 'm') {
            state = 4;
          } else {
            state = 0;
            break;
          }
        case 4:
          if (ca[i] == 'l') {
            state = 5;
          } else {
            state = 0;
            break;
          }
        default: break;
      }

      if (state == 5) {
        return true;
      }
    }

    return false;
  }
}
