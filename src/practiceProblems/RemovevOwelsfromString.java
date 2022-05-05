package practiceProblems;

import java.util.Scanner;

public class RemovevOwelsfromString {

	public static void main(String[] args) {
		
		System.out.println("Enter The String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c;
	
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			c=s.toLowerCase().charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				continue;
			}
			else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				continue;
			}
			else {
				s1=s1+c;
			}
		}
		System.out.println("After Removing the vowels from the String: "+"\'"+s1.toUpperCase()+"\'");
		
		//alternative method
//		
//		String str=s.replaceAll("[aeiouAEIOU]","");
//		System.out.println("After Removing the vowels from the String: "+"\'"+str.toUpperCase()+"\'");
		
		
		
		
		

	}

}
