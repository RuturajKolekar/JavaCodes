package Exception;

import java.util.Scanner;


class NegativeRadiusException extends Exception{
	

	private static final long serialVersionUID = 1L;

	NegativeRadiusException(String msg){
		super(msg);
	}
}	
public class MyException3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Radius");
			int radius=sc.nextInt();
			try {
;		if(radius<0) {
			  
				throw new NegativeRadiusException("Radius is Negative");
			 }
			else{
			    double d= Math.PI*radius*radius;
			    System.out.println("The area of circle is: "+d);
			 }
			}
			catch(NegativeRadiusException e){
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println("The End Of Program");
	}

}
