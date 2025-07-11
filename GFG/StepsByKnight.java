/*
Steps by Knight
Difficulty: MediumAccuracy: 37.32%Submissions: 124K+Points: 4Average Time: 20m
Given a square chessboard of size (n x n), the initial position and target postion of Knight are given. Find out the minimum steps a Knight will take to reach the target position.

Note: The initial and the target position coordinates of Knight have been given according to 1-base indexing.

Examples:

Input: n = 3, knightPos[] = [3, 3], targetPos[]= [1, 2]
Output: 1
Explanation:
Knight takes 1 step to reach from 
(3, 3) to (1 ,2).
Input: n = 6, knightPos[] = [4, 5],targetPos[] = [1, 1]
Output: 3
Explanation:

Knight takes 3 step to reach from 
(4, 5) to (1, 1):
(4, 5) -> (5, 3) -> (3, 2) -> (1, 1).
Constraints:
1 <= n<= 1000
1 <= knightpos ≤ [x, y], targertpos[x, y] ≤  n 


*/
class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        
        Queue<int[]>q=new LinkedList<>();
        int row=knightPos[1]-1;
        int destinationrow=targetPos[1]-1;
        int destinationCol=targetPos[0]-1;
        q.offer(new int[]{row,knightPos[0]-1,1});
        //knight have 8 different moves
        int[]dr={-2,-2,2,2,1,1,-1,-1};
        int[]dc={-1,1,-1,1,-2,2,-2,2};
        boolean [][]visited=new boolean[n][n];
        visited[row][knightPos[0]-1]=true;
        while(!q.isEmpty()){
            int[]cur=q.poll();
            int curRow=cur[0];
            int curCol=cur[1];
            int curStep=cur[2];
            if(curRow==destinationrow&&curCol==destinationCol){
                return curStep-1;
            }
            for(int i=0;i<8;i++){
                int newrow=curRow+dr[i];
                int newcol=curCol+dc[i];
                if(newrow>=0&&newrow<n&&newcol>=0&&newcol<n&&!visited[newrow][newcol]){
                    q.offer(new int[]{newrow,newcol,curStep+1});
                    visited[newrow][newcol]=true;
                }
            }
            
            
        }
        return -1;
        
    }
}
