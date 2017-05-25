package com.practice.arrays;

/*
 * Longest Increasing Subsequence
 * 
 * Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

 */
public class LIS {

	public int arrMax(int arr[]) {
		int max = arr[0];
		for(int j = 0; j<arr.length; j++) {
			if(arr[j]> max)
				max = arr[j];
		}
		
		return max;
		
	}
	public int getLIS(int arr[]) {
		
	 int lisArr[] = new int[arr.length];
	 for(int i=0; i<lisArr.length; i++)
		 lisArr[i] = 1;
	 
	 
	 for(int i=1; i<arr.length; i++) {
		 for(int j=0; j< i; j++) {
			 if( arr[i] > arr[j] && lisArr[i] < lisArr[j] + 1)
             lisArr[i] = lisArr[j] + 1;
		 }
	 }
	 return arrMax(lisArr);
		
	}
	
	
	public static void main(String args[]) {
		int arr[] = {3, 10, 11, 1, 20};
		LIS lis = new LIS();
		
		System.out.println(lis.getLIS(arr));
		
		
	}
}
