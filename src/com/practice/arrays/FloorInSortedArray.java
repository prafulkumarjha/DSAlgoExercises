/**
 * 
 */
package com.practice.arrays;

import java.util.Scanner;

/**
 * @author Praful Jha
 *
 */
/*
 * 
 * Given a sorted array having no duplicates, arr[] and a value, x, find floor of x in given array. Floor of x is the largest element in arr[] such that the element is smaller than or equal to x. If floor exists, then return index of it, else return -1.

Examples:

Input : arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 5
Output : 1 
1 is index of 2. 2 is the largest element in arr[]
smaller than 5.

Input : arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 20
Output : 6
19 is the largest element in arr[] smaller than 20.

Input : arr[] = {1, 2, 8, 10, 11, 12, 19}, x = 0
Output : -1
Since floor doesn't exist, output is -1.
Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and x, N is the size of array.
The second line of each test case contains N array elements.

Output:

Print index of floor of x if it exists, else print -1

Example:

Input:
3
7 0
1 2 8 10 11 12 19
7 5
1 2 8 10 11 12 19
7 10
1 2 8 10 11 12 19

Output:
-1
1
3
 
 */
public class FloorInSortedArray {

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
		    boolean isFound = false;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		   int floor = -1;
		    int X = sc.nextInt();
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		       for(int i=0; i<n; i++) {
		       if(arr[i]> X) {
		           isFound = true;
		       System.out.println(floor);
		       break;
		       }
		       else 
		       floor = i;
		       }
		       if(!isFound)
		       System.out.println(floor);
		    }
		}
}
