package practiceProblems;

import java.util.Scanner;

public class MatchingWordFrequency {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter the Matching Word");
		String s1=sc.nextLine();
		
		int count=0;
		char c;
		String s2="";
		
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(s.charAt(i)!= ' ') {
				s2=s2+c;
			}
			else {
				if(s2.equalsIgnoreCase(s1)){
					count++;
					}
				s2="";
			}
			
		}
		
		System.out.printf("The word "+"'"+s1+"'"+" is occured "+count+" times in a String");

	}

}
