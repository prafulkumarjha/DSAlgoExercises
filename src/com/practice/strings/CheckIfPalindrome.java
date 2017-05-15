package com.practice.strings;

/**
 * @author Praful Jha
 *
 */
public class CheckIfPalindrome {

	public static void main(String args[]) {
		String str = "abbccbba";
		System.out.println("Check if String is palindrome "+isPalindrome(str));
	}

	/**
	 * @return
	 */
	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int len = str.length();
		
		int i=0, j=len-1;
		char[] charArray = str.toCharArray();
		
		while(i<j) {
			if(charArray[i] != charArray[j])
				return false;
			i++;
			j--;
		}
		
		return true;
	}
}
