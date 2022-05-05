package practiceProblems;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number1");
		int num1=sc.nextInt();
		System.out.println("Enter the Number2");
		int num2=sc.nextInt();
		System.out.println("Enter the Number3");
		int num3=sc.nextInt();
		
		//1.By using else if ladder
		
		
		
		//2.By Ternary Operator

	//	int largest=num1>num2?num1:num2;
		    //largest=num3>largest?num3:largest;
		int largest=num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);
		    
		System.out.println("largest number between this three number is: "+largest);

	}

}
