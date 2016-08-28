package com.diffblue.java_test;

public class Main
{
  void do_stuff(String a, String b)
  {
    int x=Integer.parseInt(a);
    int y=Integer.parseInt(b);
    if(y!=0)
    {
      int z=new Calc().div(x,y);
      System.out.println(""+z);
    }
    else
      System.out.println("second argument must not be zero");
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
