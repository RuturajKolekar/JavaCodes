package practiceProblems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String rev="";
		/*
		//Regular Approach
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
         System.out.println("String is Reversed: "+rev);
         
        //By Char Array
		char [] c=s.toCharArray();

		for(int i=s.length()-1;i>=0;i--) {

			rev=rev+c[i];
		}
		System.out.println("String is Reversed: "+rev);
		*/
		
		//By StringBuffer
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println("String is Reversed: "+sb.reverse());
		
		
		
	}

}
