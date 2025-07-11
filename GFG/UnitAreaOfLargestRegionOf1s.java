/*
Unit Area of largest region of 1's
Difficulty: MediumAccuracy: 50.83%Submissions: 71K+Points: 4Average Time: 20m
Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
 

Example 1:

Input: grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}}
Output: 5
Explanation: The grid is-
1 1 1 0
0 0 1 0
0 0 0 1
The largest region of 1's is colored
in orange.
Example 2:

Input: grid = {{0,1}}
Output: 1
Explanation: The grid is-
0 1
The largest region of 1's is colored in 
orange.

Your Task:
You don't need to read or print anyhting. Your task is to complete the function findMaxArea() which takes grid as input parameter and returns the area of the largest region of 1's.


Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)
 

Constraints:
1 ≤ n, m ≤ 500
*/
class Solution {
    // Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid) {
        // Code here
        int maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(maxArea,dfs(grid,i,j));
                    
                }
            }
        }
        return maxArea;
    }
    public static int dfs(int[][]grid,int i,int j){
        if(i>=grid.length||i<0||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int area=1;
        grid[i][j]=0;
        area+=dfs(grid,i-1,j);
        area+=dfs(grid,i+1,j);
        area+=dfs(grid,i,j-1);
        area+=dfs(grid,i,j+1);
        area+=dfs(grid,i-1,j-1);
        area+=dfs(grid,i-1,j+1);
        area+=dfs(grid,i+1,j-1);
        area+=dfs(grid,i+1,j+1);
        return area;
    }
}
