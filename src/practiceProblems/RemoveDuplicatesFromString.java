package practiceProblems;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String s = "  It i s a   very much Pretty  ";

		s = s.replaceAll("\\s", "");

		String s1 = "java";
		char[] arr = s1.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			boolean repeted = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					repeted = true;
					break;
				}
			}
			if (repeted==false) {
				sb.append(arr[i]);
			}
		}

		System.out.println(sb);

	}

}
