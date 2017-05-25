/**
 * 
 */
package com.practice.arrays;

import java.util.Scanner;

/**
 * @author Praful Jha
 *
 */
public class ConvertMtoN {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of M : ");
		int M = in.nextInt();
		System.out.println();
		System.out.println("Enter value of N: ");
		int N = in.nextInt();
		
		ConvertMtoN obj = new ConvertMtoN();
		int minOp = obj.convertMtoN(M,N);
		if(minOp == -1 )
			System.out.println("Cannot convert");
		else 
		System.out.println("Minimum operation required to convert M to N "+minOp);
	}

	/**
	 * @param m
	 * @param n
	 * @return
	 */
	private int convertMtoN(int m, int n) {
		// TODO Auto-generated method stub
		if(m == n)
			return 0;
		if(m<=0 && n>0)
			return -1;
		else if(m>n)
			return m-n;
		else {
			if(n%2 == 1)
				return 1 + convertMtoN(m, n+1);
			else 
				return 1 + convertMtoN(m, n/2);
		}
		
		
	}
}
