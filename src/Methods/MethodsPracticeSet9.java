package Methods;


import java.util.Scanner;
class MethodsPracticeSet9
{
   static double tofaherenheit(double n)
   {
      return (n*9/5)+32;
           
    }

     public static void main (String[]args)
     {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Pattern Number");
			 double a=sc.nextInt();
			 double b= tofaherenheit(a);  
			 System.out.println(a+" deg.celsius = "+b+" deg.faherenheit");
		}     
        
     }

} 