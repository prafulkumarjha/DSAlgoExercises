package com.practice.arrays;

import java.util.Arrays;

/**
 * @author Praful Jha
 *
 */
public class MaxProductSubSequence {
	
	public static void main(String[] args) {
		int arr[] = {6, -3, -10, 0, 2};
		
	Arrays.sort(arr);
	
	int negativeCount = 0;
	int i = 0;
	int max_Product = 1;
	
	while(arr[i++]<0)
		negativeCount++;
	System.out.println("No of negative element "+negativeCount);
	
	if(negativeCount%2 != 0){
		negativeCount--;
	}
	
	for(int j=0; j<negativeCount; j++){
		
		max_Product*=arr[j];
	}
	
	while(i < arr.length) {
		if(arr[i] > 0) {
			max_Product*=arr[i];
		}
		i++;
	}
	
	System.out.println(max_Product);
		
	}

}
