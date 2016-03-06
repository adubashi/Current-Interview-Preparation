package epicInterviewPreparation;

import java.util.*;
public class FindMaxSnake{

	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		    int[][] dp = new int[3][5];
		    
		    ArrayList<String> list = new ArrayList<String>();
		    int maxLength = Integer.MIN_VALUE;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 5; j++){
					   dp[i][j] = 1; // snake can always be of length 1
					   if ( j - 1 >= 0 && Math.abs(grid[i][j - 1] - grid[i][j]) == 1){
						  System.out.println(grid[i][j]);
					      dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + 1); 
					      if(dp[i][j] > maxLength){
					    	  maxLength = dp[i][j];
					      }
					   }
					   if (i - 1 >= 0 && Math.abs(grid[i - 1][j] - grid[i][j]) == 1){
						   System.out.println(grid[i][j]);
					       dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + 1);
					       if(dp[i][j] > maxLength){
						      maxLength = dp[i][j];
						   }
					   }
				}
			}
			
			System.out.println(Arrays.deepToString(dp));
			System.out.println(maxLength);
			
		}

	private static void findMaxSnake(int[][] grid, int i, int j, int d){
		/*
		if (!state[i][j]){
			max_length = Math.max(max_length, d);
		}else {
		*/
			boolean flag = true;
			for (int ind=0; ind<nn.length; ind+=2){
				int ii = i + nn[ind];
				int jj = j + nn[ind+1];
				if (check(grid, ii, jj, i, j) && state[ii][jj]){ 
					state[ii][jj] = false;
					flag = false;
					sequence.add(grid[ii][jj]);
					findMaxSnake(grid, ii, jj, d+1);
					state[ii][jj] = true;
					sequence.remove(sequence.size()-1);
				}
			}
			if(flag && d > max_length){
				max_length = d;
				max_seq = sequence.toArray();
				
			}

	}

	private static boolean check(int[][] grid, int ii, int jj, int i, int j){
		if (ii<0 || ii>=grid.length || jj<0 || jj>=grid[0].length) return false;
		
		return(Math.abs(grid[ii][jj] - grid[i][j]) == 1);
	}

	private static ArrayList<Integer> sequence = new ArrayList<Integer>();
	private static Object[]  max_seq;


	private static int max_length = 0;

	private static int[] nn = {1,0, 0,1, 1,1, -1,0, 0,-1, 1,1, -1,1, 1,-1};

	private static int[][] grid = {
				{ 1,  3,  2,  6, 8},
				{-9,  7,  1, -1, 2},
				{ 1,  5,  0,  1, 9}
			};
	private static boolean[][] state = new boolean[grid.length][grid[0].length];

	}
