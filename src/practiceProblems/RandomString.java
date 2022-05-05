package practiceProblems;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {

	public static void main(String[] args) {
		
		String rand=RandomStringUtils.randomNumeric(5);
		System.out.println(rand);
		String rand1=RandomStringUtils.randomAlphanumeric(3);
		System.out.println(rand1);
		String rand3=RandomStringUtils.randomAlphabetic(5);
		System.out.println(rand3);

	}

}
