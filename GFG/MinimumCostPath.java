//dijkstra's algorithm is used
/*

Minimum Cost Path
Difficulty: HardAccuracy: 26.99%Submissions: 122K+Points: 8
Given a square grid of size N, each cell of which contains an integer cost that represents a cost to traverse through that cell, we need to find a path from the top left cell to the bottom right cell by which the total cost incurred is minimum.
From the cell (i,j) we can go (i,j-1), (i, j+1), (i-1, j), (i+1, j).  

Examples :

Input: grid = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}}
Output: 43
Explanation: The grid is-
9 4 9 9
6 7 6 4
8 3 3 7
7 4 9 10
The minimum cost is-
9 + 4 + 7 + 3 + 3 + 7 + 10 = 43.
Input: grid = {{4,4},{3,7}}
Output: 14
Explanation: The grid is-
4 4
3 7
The minimum cost is- 4 + 3 + 7 = 14.
Expected Time Complexity: O(n2*log(n))
Expected Auxiliary Space: O(n2) 
 Constraints:
1 ≤ n ≤ 500
1 ≤ cost of cells ≤ 500


*/
class Solution {
    // Function to return the minimum cost to react at bottom
    // right cell from top left cell.
    static class Cell{
        int row;
        int col;
        int cost;
        Cell(int r,int c,int cost){
            this.row=r;
            this.col=c;
            this.cost=cost;
        }
    }
    public int minimumCostPath(int[][] grid) {
        int[][]SmallCost=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                SmallCost[i][j]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Cell>pq=new PriorityQueue<>((x,y)->x.cost-y.cost);
        SmallCost[0][0]=grid[0][0];
        pq.add(new Cell(0,0,grid[0][0]));
        int[]dr={1,-1,0,0};
        int[]dc={0,0,1,-1};
        int minAmt=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            Cell cur=pq.poll();
            int row=cur.row;
            int col=cur.col;
            int cost=cur.cost;
            if(row==grid.length-1&&col==grid[0].length-1){
                minAmt=minAmt>cost?cost:minAmt;
            }
            for(int i=0;i<4;i++){
                int newrow=row+dr[i];
                int newcol=col+dc[i];
                if(newrow>=0&&newrow<grid.length&&newcol>=0&&newcol<grid[0].length){
                    if(SmallCost[newrow][newcol]>grid[newrow][newcol]+cost){
                        SmallCost[newrow][newcol]=grid[newrow][newcol]+cost;
                        pq.add(new Cell(newrow,newcol,SmallCost[newrow][newcol]));
                    }
                }
            }
        }
        return minAmt;
        
    }
}
