package practiceProblems;

import java.util.Scanner;

public class DigitsInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int original_num=num;
		int digits=0;
		while(num!=0) {
			num=num/10;
			digits++;
		}
         System.out.println("The Digits In The Number "+original_num+" is "+digits);
	}

}
