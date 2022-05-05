package practiceProblems;


class fibonacciByRecursion
{
    static int a=0,b=1,c;
    void fiboRec(int n)
   {
       if(n>1)
       {
          c=a+b;
          System.out.print(" "+c);
          a=b;
          b=c;
          fiboRec(n-1);
       }
   }
     public static void main(String[]args)
     {
      System.out.print(a+" "+b);
      fibonacciByRecursion obj=new fibonacciByRecursion();
       obj.fiboRec(10);

     }
}