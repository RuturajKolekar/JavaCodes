package practiceProblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number1");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0 ) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The number "+num+" is Prime Number");
		}
		else {
			System.out.println("The number "+num+" is NOT Prime Number");
		}
	}

}
