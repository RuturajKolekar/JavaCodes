package Excersize;


import java.util.Scanner;
import java.util.Random;

class Game
{
   int myNumber;
   int random;
   int noOfGuesses=0;
   void setnoOfguesses(int noOfGuesses)
   {
     this.noOfGuesses=noOfGuesses;
   }
   int getnoOfguesses()
   {
     return noOfGuesses;
   }
   Game()
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
           Game g=new Game();
           boolean b=false;
           while(!b)
           {
             g.takeUserInput();
             b=g.isCorrectNumber();
           }           
      }
}