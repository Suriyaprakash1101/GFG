/*
Rotten Oranges
Difficulty: MediumAccuracy: 46.02%Submissions: 182K+Points: 4Average Time: 20m
Given a matrix mat[][] of dimension n * m where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cell have fresh oranges
2 : Cell have rotten oranges

We have to determine what is the earliest time after which all the oranges are rotten. A rotten orange at index (i, j) can rot other fresh orange at indexes (i-1, j), (i+1, j), (i, j-1), (i, j+1) (up, down, left and right) in a unit time.

Note: Your task is to return the minimum time to rot all the fresh oranges. If not possible returns -1.

Examples:

Input: mat[][] = [[0, 1, 2], [0, 1, 2], [2, 1, 1]]
Output: 1
Explanation: Oranges at positions (0,2), (1,2), (2,0) will rot oranges at (0,1), (1,1), (2,2) and (2,1) in unit time.
Input: mat[][] = [[2, 2, 0, 1]]
Output: -1
Explanation: Oranges at (0,0) and (0,1) can't rot orange at (0,3).
Input: mat[][] = [[2, 2, 2], [0, 2, 0]]
Output: 0
Explanation: There is no fresh orange. 
Constraints:
1 ≤ mat.size() ≤ 500
1 ≤ mat[0].size() ≤ 500
*/
class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int fresh=0;
        boolean f=false;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(mat[i][j]==1){
                    fresh++;
                    f=true;
                }
            }
        }
        
        int time=-1;
        while(!q.isEmpty()){
            time++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[]cur=q.poll();
                int row=cur[0];
                int col=cur[1];
                if(row-1>=0&&row-1<mat.length&&mat[row-1][col]==1){
                    mat[row-1][col]=2;
                    q.offer(new int[]{row-1,col});
                    fresh--;
                }
                if(row+1<mat.length&&row+1>=0&&mat[row+1][col]==1){
                    mat[row+1][col]=2;
                    q.offer(new int[]{row+1,col});
                    fresh--;
                }
                if(col-1>=0&&col-1<mat[0].length&&mat[row][col-1]==1){
                    mat[row][col-1]=2;
                    q.offer(new int[]{row,col-1});
                    fresh--;
                    
                }
                if(col+1<mat[0].length&&col+1>=0&&mat[row][col+1]==1){
                    mat[row][col+1]=2;
                    q.offer(new int[]{row,col+1});
                    fresh--;
                    
                }
            }
        }
        if(fresh>0){
            return -1;
        }
        return time=f?time:0;
        
    }
}
