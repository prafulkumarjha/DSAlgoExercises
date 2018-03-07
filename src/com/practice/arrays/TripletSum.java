package com.practice.arrays;

import java.util.Arrays;

/**
 * @author Praful Jha
 *
 */
public class TripletSum {

	public static void main(String args[]) {
		int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 23;
        
        TripletSum triplet = new TripletSum();
        System.out.println(triplet.isTripletWithSumAvailable(arr,sum));
	}

	/**
	 * @param arr
	 * @param sum
	 */
	private boolean isTripletWithSumAvailable(int[] arr, int sum) {
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			int start = i+1;
			int end = arr.length-2;
			while(start<end) {
				if(arr[i]+arr[start]+arr[end]==sum)
					return true;
				else if(arr[i]+arr[start]+arr[end] <sum)
					start++;
				else
					end--;
			}
		}
		return false;
		// TODO Auto-generated method stub
		
	}
}
