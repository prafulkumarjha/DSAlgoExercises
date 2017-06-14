package com.practice.arrays;

import java.util.HashSet;

/**
 * @author Praful Jha
 *
 */
public class Test {

	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<100; i++) {
			set.add(i);
		}
		System.out.println(set.size());
	}
}
