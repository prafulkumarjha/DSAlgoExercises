package com.practice.arrays;

/**
 * @author Praful Jha
 *
 */
public class AlternateNegativeAndPositive {

	public static void main(String args[]) {
		int arr[]  = { -1, 2, 3, 1, -2, -3 };
		printArray(arr);
	}	
	

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int i = 0, j = arr.length-1;
		int temp;
		while(i<j) {
			if(arr[j]<0 && arr[i]>0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			 if(arr[j]>0)
				j--;
			 if(arr[i]<0 )
				i++;
		}
		for(int k=0; k<arr.length; k++)
		System.out.print(arr[k] +" ");
		
	}
	


}
