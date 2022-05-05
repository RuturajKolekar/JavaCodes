package Methods;


import java.util.Scanner;
class MethodsPracticeSet10
{
      static int naturalnumber(int n)
      {
         int sum=0;
         for (int i=1;i<=n;i++)
         {
            sum +=i;
         }
          return sum;
      }

     public static void main (String[]args)
     {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Pattern Number");
			 int a=sc.nextInt();
			  int result =naturalnumber(a);
			 System.out.printf("The Sum Of first %d Numbers is: %d ",a,result);
		}
     }

} 