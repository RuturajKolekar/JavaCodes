package Methods;


import java.util.Scanner;
class Methods
{  
	 int logic(int x,int y)
	{
		int z;
		z=x%y;
		return z;
	}
	public static void main(String[]args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Number");
			int a= sc.nextInt();
			System.out.println("Enter Second Number");
			int b= sc.nextInt();
			int c;
			Methods obj= new Methods();
			c=obj.logic(a,b);
			//c=logic(a,b);
			System.out.println("Your Logic is:  " + c);
		}
	} 


}
