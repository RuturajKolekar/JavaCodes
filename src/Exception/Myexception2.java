package Exception;

import java.util.Scanner;
class MaxRetriesExceed extends Exception{

	private static final long serialVersionUID = 1L;

	MaxRetriesExceed(String msg){
		super(msg);
	}
	
}

public class Myexception2 {
	
	public static void getValueOfArry() {
  	  int [] marks= {50,60,70};
  		  
  		  int i=1;
  		try (Scanner sc = new Scanner(System.in)) {
			while(true && i<=5){
			      try {
			           System.out.println("Enter the value");
					   int index=sc.nextInt();
					   System.out.printf("The value of array at index %d is %d\n",index,marks[index]);
					   break;
			      }
				  catch(Exception e) {
					      System.out.println("Enter Valid Index");
					      i++;
				          }
			     }
		}
  		if(i>5) {
  	    	  try {
  	    	  throw new MaxRetriesExceed("You Riched The Max Retries");
  	    	  }
  	    	  catch(MaxRetriesExceed e) {
  	    		  e.printStackTrace();
  	    		 
  	    	  }
  	     }
	}	      
	public static void main(String[]args) {
		getValueOfArry();
		System.out.println("The End");
	 }

   }

