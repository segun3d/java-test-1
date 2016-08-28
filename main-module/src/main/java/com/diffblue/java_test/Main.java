package com.diffblue.java_test;

public class Main
{
  void do_stuff(String a, String b)
  {
  }

  public static void main(String[] args)
  {
    if(args.length<2)
    {
      System.out.println("need two arguments");
      return;
    }
    new Main().do_stuff(args[0], args[1]);
  }
}
