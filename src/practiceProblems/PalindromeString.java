package practiceProblems;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
        if(s.equals(rev)) {
        	System.out.println("The String "+s+" is Palindrome String");
        }
        else {
        	System.out.println("The String "+s+" is not Palindrome String");
        }
	}

}
