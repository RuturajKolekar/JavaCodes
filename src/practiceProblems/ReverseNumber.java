package practiceProblems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		/*
		//By Algorithm
		int rev=0;
		while(num!=0) {
			rev=rev*10+ num%10;
			num=num/10;
		}
		System.out.println("Number is Reversed: "+rev);
		
		
		//By StringBuffer
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Number is Reversed: "+rev);
		
		*/
		
		//By StringBuilder
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println("Number is Reversed: "+rev);
		

	}

}
