package practiceProblems;


import java.util.ArrayList;
import java.util.Scanner;

public class SameCharctorsInTwoString {

	public static void main(String[] args) {
		
		ArrayList<Object> obj=new ArrayList();
		ArrayList<Object> obj1=new ArrayList();
		System.out.println("Enter the First string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			obj.add(i,s.charAt(i));
		}
		System.out.println("Enter the Second string");
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			obj1.add(i,s1.charAt(i));
		}
		obj.retainAll(obj1);
        System.out.println(obj);
	}

}
