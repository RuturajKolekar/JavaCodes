package practiceProblems;


import java.util.Scanner;
class FactorialByRecursion
{
      static int factorial(int a)
      {
          
         if(a==0 || a==1)
         {
         return 1;
         }
         else
         {
           return a * factorial(a-1); 
         }
       
      }
       public static void main(String[] args)
       {
          try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your Number");   
			  int x=sc.nextInt();
			 int c=factorial(x);
			 
			  System.out.println("The Factorial of "+ x + " is " + c);
		}       
       }
}