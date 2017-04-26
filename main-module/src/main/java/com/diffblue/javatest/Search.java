package com.diffblue.javatest;

public class Search {
  public boolean contains(int [] array, int target) {
    boolean found = false;
    int i;

    for (i = 0; i < array.length; ++i) {
      if (array[i] == target) {
        found = true;
      }
    }

    return found;
  }
}
