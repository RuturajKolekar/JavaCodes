package practiceProblems;


import java.util.Scanner;
class Recursion
{
     static int fact=1;
    void calcfact (int a)
    {
     	   if(a>=1)
      	   {
   	   fact=fact * a;
   	   calcfact(a-1); 
           }   
     }
     public static void main (String[]args)
     {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your Number");
			 int x=sc.nextInt();
			 Recursion obj=new Recursion();
			 obj.calcfact(x);
			 
			 System.out.println("The Factorial Of "+ x + " is "+ fact );
		}   
     }
}