package practiceProblems;



public class MatchingWordFrequency2 {

	public static void main(String[] args) {

		String s1 = "yo yo Honney Singh YO YO";
		String s2 = "yo";
		int length = s1.length();
		String match = "";
		char ch;
		int count = 0;

		for (int i = 0; i < length; i++) {

			ch = s1.charAt(i);
			if (ch != ' ') {
				match = match + ch;
				if (i == length-1) {
					if (match.equalsIgnoreCase(s2)) {
						count++;
					} 
				}
			} else {
				if (match.equalsIgnoreCase(s2)) {
					count++;
				}
				match = "";
			}

		}

		System.out.println("The Word " + s2 + " is repeted " + count + " in " + s1);

	}

}
