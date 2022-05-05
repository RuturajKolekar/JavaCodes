package practiceProblems;

import java.util.Scanner;

public class Even_OddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		while(num!=0) {
			int c=num%10;
			if(c%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
		}
		
		System.out.println("Even Numbers in This Number are: "+even);
		System.out.println("Odd Numbers in This Number are: "+odd);
	}

}
