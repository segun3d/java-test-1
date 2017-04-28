package com.diffblue.javatest;

public class BubbleSort {
  /**
   * Applies bubble sort to an array and returns whether the array was sorted correctly.
   */
  public boolean checkSort(int[] a) {
    sort(a);

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        return false;
      }
    }

    return true;
  }

  /**
   * Bubble sort an array, mutating the array (contains a bug).
   */
  public void sort(int [] a) {
    int j;
    boolean flag = true;
    int temp;

    while (flag) {
      flag = false;
      for (j = 0; j < a.length - 1; j++) {
        if (a[j] > a[j + 1] + 1) { // The bug is on this line
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = true;
        }
      }
    }
  }
}
