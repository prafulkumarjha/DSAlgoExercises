/**
 * 
 */
package com.practice.arrays;

/**
 * @author Praful Jha
 *
 */
public class SortArrayToFormBiggestNumber {


	static int IntConcat(int a, int b)
	{
	    int t=10;
	    while(b>=t)
	        t*=10;
	    return a*t+b; 
	}
	public static void main(String args[]) {
		int arr[] = {1,19};
		//int arr1[] = new int[10];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(SortArrayToFormBiggestNumber.IntConcat(arr[i], arr[j]) 
						< SortArrayToFormBiggestNumber.IntConcat(arr[j], arr[i])) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]);
		
	}
}
