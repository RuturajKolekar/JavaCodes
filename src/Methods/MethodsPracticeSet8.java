package Methods;


import java.util.Scanner;
class MethodsPracticeSet8
{
   static void patternRec(int n)
   {
       if(n>0)
       {
        for(int i=n;i>0;i--)
         {
           System.out.print("*");
         }
           System.out.println();
           patternRec(n-1);
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