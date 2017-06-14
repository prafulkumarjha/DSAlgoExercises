/**
 * 
 */
package com.practice.dp;

/**
 * @author Praful Jha
 *
 */
public class Knapsack {

	
	 // Driver program to test above function
    public static void main(String args[])
    {
        int val[] = new int[]{60, 100, 120};
    int wt[] = new int[]{10, 20, 30};
    int  W = 50;
    int n = val.length;
    System.out.println(knapSack(W, wt, val, n));
    }

	/**
	 * @param w
	 * @param wt
	 * @param val
	 * @param n
	 * @return
	 */
	private static int knapSack(int TW, int[] wt, int[] val, int n) {
		// TODO Auto-generated method stub
		
		int i, w;
		int K[][] = new int[n+1][TW+1];
		
		for(i=0; i<n+1; i++ ) {
		
			for(w=0; w<TW+1; w++) {
				if(i==0 || w==0)
					K[i][w] = 0;
				else if(w >= wt[i-1]) {
					K[i][w] = Math.max(K[i][w-TW],2);
				}
				
			}
		}
		
		return 0;
	}
}
