package com.diffblue.java_test;

public class Additions
{
  /* checks if an array represents a valid tic-tac-toe
   * position. Encoding of input:
   * 1: player X field
   * 2: player O field
   * 0: empty position
   *
   * return values:
   * -1: not a correct position
   * 0: nobody has won
   * 1: player X has won
   * 2: player O has won
   */
  byte checkTicTacToePosition(byte[] a)
  {
    //first check number of rows
    if (a.length != 9)
      return -1;

    //next check number of moves each player made
    byte diff = 0;
    for (byte i=0; i<9; i++) {
        if (a[i] == 1)
          diff++;
        else if (a[i] == 2)
          diff--;
        else if (a[i] != 0)
          return -1;
    }

    if (diff > 1 || diff < -1)
      return -1;

    //Now we know we have a valid position

    //Check if a row and column is winning
    for (byte i=0; i<3; i++) {
      if (a[i] == a[3+i] && a[i] == a[6+i]) {
        return a[i];
      }

      if (a[3*i] == a[3*i + 1] && a[3*i] == a[3*i + 2]) {
        return a[i];
      }
    }

    //Check if the top-left bottom-right diagonal is winning
    if (a[0] == a[4] && a[0] == a[8]) {
      if(a[0] == 1)
        return 1;
      else if (a[0] == 2)
        return 2;
    }

    //Check if the top-right bottom-left diagonal is winning
    if (a[2] == a[4] && a[2] == a[6]) {
      if(a[2] == 1)
        return 1;
      else if (a[2] == 2)
        return 2;
    }

    //nobody won yet
    return 0;
  }

  /*
   * checks if an array contains a sequence
   * [... '<','h','t','m','l' ...]
   */  
  public boolean containsUnsafeSequence(char[] ca){
    int state = 0;
    for(int i=0; i<ca.length; i++) {
      switch(state) {
        case 0: if (ca[i]=='<') state=1; else state=0; break;
        case 1: if (ca[i]=='h') state=2; else state=0; break;
        case 2: if (ca[i]=='t') state=3; else state=0; break;
        case 3: if (ca[i]=='m') state=4; else state=0; break;
        case 4: if (ca[i]=='l') state=5; else state=0; break;
        default: ;
      }

      if (state == 5) {
        return true;
      }
    }

    return false;
  }
  
  /* applies bubblesort and checks
   * if the result is sorted
   */
  public boolean bubbleSortWrapper(int[] a) {
    bubbleSort(a);

    System.out.println(java.util.Arrays.toString(a));

    for (int i=0; i<a.length-1; i++) {
      if (a[i] > a[i+1])
        return false;
    }

    return true;
  }

  /* bubble sort -- with error */
  public void bubbleSort(int [] a)
  {
    int j;
    boolean flag = true;
    int temp;

    while (flag)
    {
      flag=false;
      for(j=0; j<a.length-1; j++)
      {
        if (a[j] > a[j+1]+1) //hint: error is on this line.
        {
          temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
          flag = true;
        }
      }
    }
  }
}
