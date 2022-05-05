package Excersize;


import java.util.Scanner;
import java.util.Random;

class Game1
{
   int myNumber;
   int random;
   int noOfGuesses=0;
   
   Game1()
   {
     Random rn=new Random();
        random=rn.nextInt(101);    
   }
   void takeUserInput()
   {
    Scanner sc = new Scanner(System.in);
		System.out.println("Guess The Number");
		myNumber=sc.nextInt();
	}
   
   boolean isCorrectNumber()
   {
     noOfGuesses++;
     if(random>myNumber)
     {
        System.out.println("Too Small,Try Again");
        return false;
     }
     else if(random<myNumber)
     {
        System.out.println("Too Large,Try Again");
        return false;
     }
     else
     {
        System.out.printf("Yess!!,You Guess the number %d in %d attempts",random,noOfGuesses);
         return true;
     }
   }
    
      public static void main(String[]args)
      {
           Game1 g=new Game1();
           boolean b=false;
           while(!b)
           {
             g.takeUserInput();
            b=g.isCorrectNumber();
           }           
      }
}