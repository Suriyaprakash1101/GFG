/*
N-Queen Problem
Difficulty: HardAccuracy: 35.43%Submissions: 106K+Points: 8Average Time: 25m
The n-queens puzzle is the problem of placing n queens on a (n × n) chessboard such that no two queens can attack each other. Note that two queens attack each other if they are placed on the same row, the same column, or the same diagonal.

Given an integer n, find all distinct solutions to the n-queens puzzle.
You can return your answer in any order but each solution should represent a distinct board configuration of the queen placements, where the solutions are represented as permutations of [1, 2, 3, ..., n]. In this representation, the number in the ith position denotes the row in which the queen is placed in the ith column.
For eg. below figure represents a chessboard [3 1 4 2].



Examples:

Input: n = 1
Output: [1]
Explaination: Only one queen can be placed in the single cell available.
Input: n = 4
Output: [[2 4 1 3 ] [3 1 4 2 ]]
Explaination: There are 2 possible solutions for n = 4.
Input: n = 2
Output: []
Explaination: There are no possible solutions for n = 2.
Constraints:
1 ≤ n ≤ 10
*/
class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        int[][]a=new int[n][n];
        queen(a,0,l);
        return l;
    
    }
    public static void queen(int[][]a,int row,ArrayList<ArrayList<Integer>>l){
        if(row==a.length){
            Append(a,l);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(check(a,row,i)){
                a[row][i]=1;
                queen(a,row+1,l);
                a[row][i]=0;
            }
        }
    }
    public static boolean check(int[][]a,int row,int col){
        for(int i=0;i<col;i++){
            if(a[row][i]==1){
                return false;
            }
        }
        for(int i=0;i<row;i++){
            if(a[i][col]==1){
                return false;
            }
        }
        int c=col-1;
        int r=row-1;
        //left diagonal
        while(c>=0&&r>=0){
            if(a[r][c]==1){
                return false;
            }
            else{
                r--;
                c--;
            }
        }
        //right diagonal
        r=row-1;
        c=col+1;
        while(c<a.length&&r>=0){
            if(a[r][c]==1){
                return false;
            }
            else{
                c++;
                r--;
            }
        }
        return true;
    }
    public static void Append(int[][]a,ArrayList<ArrayList<Integer>>l){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]==1){
                    list.add(j+1);
                }
            }
        }
        l.add(list);
        
    }
}
