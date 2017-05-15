package com.practice.recursion;

/**
 * @author Praful Jha
 *
 */
/*
 * Given two numbers x and n, 
 * find number of ways x can be expressed as sum of n-th power of unique natural numbers.
 * Examples:

Input  : x = 10, n = 2
Output : 1
Explanation: 10 = 12 + 32, 
Hence total 1 possibility

Input  : x = 100, n = 2
Output : 3
Explanation: 100 = 102
             OR 62 + 82
             OR 12 + 32 + 42 + 52 + 72
Hence total 3 possibilities
 * 
 */
public class IntegerAsPowerSum {
	
	// Function to calculate and return the
	// power of any given number
	int power(int num,  int n)
	{
	    if (n == 0)
	        return 1;
	    else if (n%2 == 0)
	        return power(num, n/2)*power(num, n/2);
	    else
	        return num*power(num, n/2)*power(num, n/2);
	}
	 
	// Function to check power representations recursively
	int checkRecursive(int x, int n, int curr_num ,
	                   int curr_sum)
	{
	    // Initialize number of ways to express
	    // x as n-th powers of different natural
	    // numbers
	    int results = 0;
	 
	    // Calling power of 'i' raised to 'n'
	    int p = power(curr_num, n);
	    while (p + curr_sum < x)
	    {
	        // Recursively check all greater values of i
	        results += checkRecursive(x, n, curr_num+1,
	                                        p+curr_sum);
	        curr_num++;
	        p = power(curr_num, n);
	    }
	 
	    // If sum of powers is equal to x
	    // then increase the value of result.
	    if (p + curr_sum == x)
	        results++;
	 
	    // Return the final result
	    return results;
	}
	
	public static void main(String args[]) {
		
		
	}

}
