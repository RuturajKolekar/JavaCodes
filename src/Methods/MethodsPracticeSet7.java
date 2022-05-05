package Methods;


import java.util.Scanner;
class MethodsPracticeSet7
{
   static void patternRec(int n)
   {
       if(n>0)
       {
         patternRec(n-1);
         for(int i=0;i<n;i++)
         {
           System.out.print("*");
         }
           System.out.println();
       }  
    }

     public static void main (String[]args)
     {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Pattern Number");
			 int a=sc.nextInt();
			 patternRec(a);
		}        
        
     }

} 