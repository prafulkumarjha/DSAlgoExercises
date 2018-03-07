/**
 * 
 */
package com.practice.dp;

/**
 * @author Praful Jha
 *
 */
public class Knapsack {

	



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

	 
	    // A utility function that returns maximum of two integers
	    static int max(int a, int b) { return (a > b)? a : b; }
	      
	   // Returns the maximum value that can be put in a knapsack of capacity W
	    static int knapSack1(int W, int wt[], int val[], int n)
	    {
	         int i, w;
	     int K[][] = new int[n+1][W+1];
	      
	     // Build table K[][] in bottom up manner
	     for (i = 0; i <= n; i++)
	     {
	         for (w = 0; w <= W; w++)
	         {
	             if (i==0 || w==0)
	                  K[i][w] = 0;
	             else if (wt[i-1] <= w) {
	            	 System.out.println("val[i-1] : "+val[i-1]+" w-wr[i-1] : "+(w-wt[i-1]));
	             
	                   K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
	             }
	             else
	                   K[i][w] = K[i-1][w];
	         }
	      }
	      
	      return K[n][W];
	    }
	 
	   
	    // Driver program to test above function
	    public static void main(String args[])
	    {
	        int val[] = new int[]{60, 100, 120};
	    int wt[] = new int[]{10, 20, 30};
	    int  W = 50;
	    int n = val.length;
	    System.out.println(knapSack1(W, wt, val, n));
	    }
	
	

}
