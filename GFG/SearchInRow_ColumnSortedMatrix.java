/*
Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.

Examples:

Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
Output: false
Explanation: 62 is not present in the matrix, so output is false.
Input: mat[][] = [[18, 21, 27],[38, 55, 67]], x = 55
Output: true
Explanation: 55 is present in the matrix.
Input: mat[][] = [[1, 2, 3],[4, 5, 6],[7, 8, 9]], x = 3
Output: true
Explanation: 3 is present in the matrix.
*/
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int index=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][index]>=x){
                boolean b=find(mat,i,x);
                if(b){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean find(int[][]a,int row,int element){
        int s=0;
        int e=a[row].length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[row][mid]==element){
                return true;
            }
            else if(a[row][mid]>element){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}
