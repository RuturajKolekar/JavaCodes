package practiceProblems;

public class UpperCaseLettersInString {

	public static void main(String[] args) {
		
		String s="Find UpperCase Letters In STRing";
		String uppercase="";
		char ch;
		int length=s.length();
		int count=0;
		for(int i=0;i<length;i++) {
			ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(ch+" ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("String having "+count+" Uppercase Letters");
		

	}

}
