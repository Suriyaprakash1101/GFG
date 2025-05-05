/*
Is Sudoku Valid
Difficulty: MediumAccuracy: 41.18%Submissions: 25K+Points: 4Average Time: 15m
Given an incomplete Sudoku configuration in terms of a 9x9  2-D square matrix(mat[][]) the task to check if the current configuration is valid or not where a 0 represents an empty block.
Note: Current valid configuration does not ensure validity of the final solved sudoku. 

Examples:

Input: mat[][] = [
[3, 0, 6, 5, 0, 8, 4, 0, 0]
[5, 2, 0, 0, 0, 0, 0, 0, 0]
[0, 8, 7, 0, 0, 0, 0, 3, 1]
[0, 0, 3, 0, 1, 0, 0, 8, 0]
[9, 0, 0, 8, 6, 3, 0, 0, 5]
[0, 5, 0, 0, 9, 0, 6, 0, 0]
[1, 3, 0, 0, 0, 0, 2, 5, 0]
[0, 0, 0, 0, 0, 0, 0, 7, 4]
[0, 0, 5, 2, 0, 6, 3, 0, 0]
]
Output: true
Explaination: It is possible to have aproper sudoku.
Input: mat[][] = [
[3, 0, 3, 5, 0, 8, 4, 0, 0]
[5, 2, 0, 0, 0, 0, 0, 0, 0]
[0, 8, 7, 0, 0, 0, 0, 3, 1]
[0, 0, 3, 0, 1, 0, 0, 8, 0]
[9, 0, 0, 8, 6, 3, 0, 0, 5]
[0, 5, 0, 0, 9, 0, 6, 0, 0]
[1, 3, 0, 0, 0, 0, 2, 5, 0]
[0, 0, 0, 0, 0, 0, 0, 7, 4]
[0, 0, 5, 2, 0, 6, 3, 0, 0]
]
Output: false
Explaination: It is not possible to have aproper sudoku.
Input: mat[][] = [
[2, 0, 2, 5, 0, 8, 4, 0, 0]
[5, 2, 0, 0, 0, 0, 0, 0, 0]
[0, 8, 7, 0, 0, 0, 0, 3, 1]
[0, 0, 3, 0, 1, 0, 0, 8, 0]
[9, 0, 0, 8, 6, 3, 0, 0, 5]
[0, 5, 0, 0, 9, 0, 6, 0, 0]
[1, 3, 0, 0, 0, 0, 2, 5, 0]
[0, 0, 0, 0, 0, 0, 0, 7, 4]
[0, 0, 5, 2, 0, 6, 3, 0, 0]
]
Output: false
Explaination: It is not possible to have aproper sudoku.
Constraints:
0 ≤ mat[i][j] ≤ 9
*/
class Solution {
    static boolean isValid(int mat[][]) {
        // code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=0){
                    if(!valid(mat,mat[i][j],i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean valid(int[][]mat,int num,int row,int col){
        int countrow=0;
        int countcol=0;
        for(int i=0;i<mat.length;i++){
            if(mat[row][i]==num){
                countrow++;
            }
            if(mat[i][col]==num){
                countcol++;
            }
        }
        if(countrow!=1||countcol!=1){
            return false;
        }
        int countbox=0;
        int localrow=row-row%3;
        int localcol=col-col%3;
        for(int i=localrow;i<localrow+3;i++){
            for(int j=localcol;j<localcol+3;j++){
                if(mat[i][j]==num){
                    countbox++;
                }
            }
        }
        if(countbox!=1){
            return false;
        }
        return true;
    }
}
