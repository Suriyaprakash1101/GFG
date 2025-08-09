/*
Rat in a Maze Problem - I
Difficulty: MediumAccuracy: 35.75%Submissions: 362K+Points: 4Average Time: 25m
Consider a rat placed at position (0, 0) in an n x n square matrix mat[][]. The rat's goal is to reach the destination at position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).

The matrix contains only two possible values:

0: A blocked cell through which the rat cannot travel.
1: A free cell that the rat can pass through.
Your task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1), under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that are within the bounds of the matrix and not blocked.
If no path exists, return an empty list.

Note: Return the final result vector in lexicographically smallest order.

Examples:

Input: mat[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
Output: ["DDRDRR", "DRDDRR"]
Explanation: The rat can reach the destination at (3, 3) from (0, 0) by two paths - DRDDRR and DDRDRR, when printed in sorted order we get DDRDRR DRDDRR.
Input: mat[][] = [[1, 0], [1, 0]]
Output: []
Explanation: No path exists as the destination cell is blocked.
Input: mat = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
Output: ["DDRR", "RRDD"]
Explanation: The rat has two possible paths to reach the destination: 1. "DDRR" 2. "RRDD", These are returned in lexicographically sorted order.
Constraints:
2 ≤ mat.size() ≤ 5
0 ≤ mat[i][j] ≤ 1
*/
class Solution {
    // Function to find all possible paths
   public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String>ans=new ArrayList<>();
        path(maze,0,0,ans,"",new boolean[maze.length][maze[0].length]);
        return ans;
    }
    public static void path(int[][]a,int row,int col,ArrayList<String>ans,String str,boolean[][]visited){
        if(row<0||row>=a.length||col<0||col>=a[0].length||a[row][col]==0||visited[row][col]){
            return;
        }
        if(row==a.length-1&&col==a[0].length-1&&a[row][col]==1){
            ans.add(str);
            return;
        }
        visited[row][col]=true;
        path(a,row+1,col,ans,str+"D",visited);
        path(a,row,col-1,ans,str+"L",visited);
        path(a,row,col+1,ans,str+"R",visited);
        path(a,row-1,col,ans,str+"U",visited);
        visited[row][col]=false;
    }
}
