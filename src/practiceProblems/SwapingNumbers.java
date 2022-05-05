package practiceProblems;


class SwapingNumbers
{
  
   public static void main(String[]args)
   {
         int a=10,b=20;
         System.out.printf("The Values of a & b before swapping are %d & %d\n",a,b); 
         swap1();
         swap2();
         swap3();
         swap4();
         swap5();
   }
      static void  swap1()
      {
     int a=10,b=20,temp; 
      temp=a;
       a=b;
       b=temp;
       System.out.printf("1.The Values of a & b after swapping are %d & %d\n",a,b); 
      }
      static void swap2()
      {
      int a=10,b=20; 
        a=a+b;
        b=a-b;
        a=a-b;
       System.out.printf("2.The Values of a & b after swapping are %d & %d\n",a,b); 
      }
      static void swap3()
      {
        int a=10,b=20;
        a=a*b;
        b=a/b;
        a=a/b;
       System.out.printf("3.The Values of a & b after swapping are %d & %d\n",a,b); 
      }
      static void swap4()
      {
        int a=10,b=20;
        a=a^b;
        b=a^b;
        a=a^b;
       System.out.printf("4.The Values of a & b after swapping are %d & %d\n",a,b); 
      } 
      static void swap5()
      {
        int a=10,b=20;
        b=(a+b)-(a=b);
       System.out.printf("5.The Values of a & b after swapping are %d & %d\n",a,b); 
      } 
}