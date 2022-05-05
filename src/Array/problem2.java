package Array;


import java.util.Scanner;
class ArrysPracticeSet2{

     public static void main (String[]args){
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your Number");
			 int a=sc.nextInt(); 
			  int i;
			 int count=0;
			 float [] runs={80,87,90,54,69};
			 for(i=0;i<runs.length;i++){
			         if(a==runs[i]){
			          count++;
			          break;
			        } 
			     }
			     if(count>=1){
			      System.out.println("The Number is Present At " + i +" Position");   
			    }
			     else{
			          System.out.println("The Number is not Present in this Arry");
			         }
		}
   }
}


                