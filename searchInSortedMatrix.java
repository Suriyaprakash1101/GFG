/*
Search in a sorted Matrix
Difficulty: MediumAccuracy: 56.27%Submissions: 124K+Points: 4
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

Examples:

Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.
Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
Output: false
Explanation: 42 is not present in the matrix.
Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.
*/

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
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
