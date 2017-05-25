/**
 * 
 */
package com.practice.arrays;

/**
 * @author Praful Jha
 *
 */
public class ReplaceOWithXDemo {

	static int M = 6; 
	static int N = 6;
	// Driver program to test above function
		public static void main(String args[])
		{
			int M = 6;
			int N = 6;
		 /*   char mat[][] =  {{'X', 'O', 'X', 'O', 'X', 'X'},
		                     {'X', 'O', 'X', 'X', 'O', 'X'},
		                     {'X', 'X', 'X', 'O', 'X', 'X'},
		                     {'O', 'X', 'X', 'X', 'X', 'X'},
		                     {'X', 'X', 'X', 'O', 'X', 'O'},
		                     {'O', 'O', 'X', 'O', 'O', 'O'},
		                    };*/
			 char mat[][] = {{'X', 'O', 'X', 'X', 'X', 'X'},
                     {'X', 'O', 'X', 'X', 'O', 'X'},
                     {'X', 'X', 'X', 'O', 'O', 'X'},
                     {'O', 'X', 'X', 'X', 'X', 'X'},
                     {'X', 'X', 'X', 'O', 'X', 'O'},
                     {'O', 'O', 'X', 'O', 'O', 'O'},
                    };
		    
		    ReplaceOWithXDemo obj = new ReplaceOWithXDemo();
		    obj.replaceSurrounded(mat);
		 
		    System.out.println("output");
		    for (int i=0; i<M; i++)
		    {
		      for (int j=0; j<N; j++)
		          System.out.print(mat[i][j]+ " ");
		     System.out.println();
		    }
		    
		}

		/**
		 * @param mat
		 */
		private void replaceSurrounded(char[][] mat) {
			// TODO Auto-generated method stub
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(mat[i][j] == 'O')
						mat[i][j] = '-';
				}
			}
			
			for(int i=0; i<M; i++) {
				if(mat[i][0] == '-')
				floodFillUtils(mat,i,0,'-','O');
			}
			
			for(int i=0; i<M; i++) {
				if(mat[i][N-1] == '-')
				floodFillUtils(mat,i,N-1,'-','O');
			}
			
			for(int j=0; j<N; j++) {
				if(mat[0][j] == '-')
				floodFillUtils(mat,0,j,'-','O');
			}
			
			for(int j=0; j<N; j++) {
				if(mat[M-1][j] == '-')
				floodFillUtils(mat,M-1,j,'-','O');
			}
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(mat[i][j] == '-')
						mat[i][j] = 'X';
				}
			}
		}

		/**
		 * @param mat
		 * @param i
		 * @param j
		 * @param c
		 * @param d
		 */
		private void floodFillUtils(char[][] mat, int X, int Y, char prevV, char newV) {
			// TODO Auto-generated method stub
			
			if(isInvalid(X,Y))
				return;
			
			if(mat[X][Y] !=prevV )
				return;
			
			mat[X][Y] = newV;
			
			//recurse in all direction
			floodFillUtils(mat, X+1, Y, prevV, newV);
			floodFillUtils(mat, X-1, Y, prevV, newV);
			floodFillUtils(mat, X, Y+1, prevV, newV);
			floodFillUtils(mat, X, Y-1, prevV, newV);
			
		}

		/**
		 * @param x
		 * @param y
		 * @return
		 */
		private boolean isInvalid(int x, int y) {
			// TODO Auto-generated method stub
			if(x<0 || y<0 || x>=M || y>=N)
			return true;
			
			return false;
		}
}
