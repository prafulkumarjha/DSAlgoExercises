package com.practice.recursion;

/**
 * @author Praful Jha
 *
 */
public class Factorial {

	static int fact_val = 1;
	 int findFactorial(int n) {
		
		 if(n==1 || n==0) 
			 return 1;
		 return fact_val*n*findFactorial(n-1);
		 
		// return 0;
	}
	public static void main(String argsp[]) {
		Factorial fact = new Factorial();
		
		System.out.println(fact.findFactorial(6));
	}
}
