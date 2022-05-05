package Excersize;


import java.util.Scanner;
import java.util.Random;
class GussesTheNumber
{
   public static void main(String[]args)
   {
      Random rn=new Random();
      int r=rn.nextInt(101);
      try (Scanner sc = new Scanner(System.in)) {
		boolean correct= false;
		  while(!correct)
		  {
		    System.out.println("Guess The Number");
		    int a=sc.nextInt();
		   if(r>a)
		   {
		    System.out.println("Too Small,try again");
		   }
		   else if(r<a)
		   {
		    System.out.println("Too Large,try again");
		   }
		   else 
		   {
		    System.out.println("Yesss,You guessed the number");
		     correct=true;
		   }
		  }
	}
   }
}