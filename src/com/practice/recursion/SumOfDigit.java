package com.practice.recursion;

/**
 * @author Praful Jha
 *
 */
public class SumOfDigit {

	public int findSumOfDigit(int n) {
	
		if(n == 0) 
			return 0;
		return (n%10+findSumOfDigit(n/10));
	}
	
	public static void main(String args[]) {
		SumOfDigit sum = new SumOfDigit();
		System.out.println(sum.findSumOfDigit(129));
	}
}
