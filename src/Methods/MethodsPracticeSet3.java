package Methods;


class MethodsPracticeSet3
{
    static int sumRec(int n)
    {
       
      if(n==1)
      {
        return 1;
      }
       else
      {
        return n + sumRec(n-1);
      }
    } 
      public static void main(String[]args)
      {
        int a=5;
        int c=sumRec(a);
        System.out.println("The sum of first "+a+ " Natural Numbers is: "+c );
      }

}