package practiceProblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingOfString {

	public static void main(String[] args) {

		String s = "ruturaj";
		char[] arr = s.toCharArray();
		char temp;
		
		int length = arr.length;
//		for (int i = 0; i < length; i++) {
//			for (int j = i + 1; j < length; j++) {
//                
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(new String(arr));
		
		List<String>s1= Arrays.asList(s);
		Collections.sort(s1,String.CASE_INSENSITIVE_ORDER);
		System.out.println(s1);
	}

}
