package practiceProblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		int d=0;
		while(num!=0) {
			 d=num%10;
			 sum=sum+d;
			 num=num/10;
		}  
		System.out.println("The sum of all digits is: "+sum);
	}

}
