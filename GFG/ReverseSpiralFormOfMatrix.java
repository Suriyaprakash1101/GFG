/*
Reverse Spiral Form of Matrix
Difficulty: MediumAccuracy: 57.45%Submissions: 16K+Points: 4
Given a matrix as 2D array. Find the reverse spiral traversal of the matrix. 

Example 1:

Input: R = 3, C = 3
  a = {{9, 8, 7},
       {6, 5, 4},
       {3, 2, 1}}
Output: 5 6 3 2 1 4 7 8 9
Explanation: Spiral form of the matrix
in reverse order starts from the centre 
and goes outward.


Example 2:

Input: R = 4, C = 4 
  a = {{1, 2, 3, 4},
       {5, 6, 7, 8},
       {9, 10, 11, 12}, 
       {13, 14, 15, 16}}
Output: 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
Explanation: 


Your Task:  
You dont need to read input or print anything. Complete the function reverseSpiral() which takes R, C and a as input parameters and returns the matrix in reverse spiral form.

Expected Time Complexity: O(R*C)
Expected Auxiliary Space: O(R*C)

Constraints:
1 <= R,C <=100
1 <= a[R][C] <=100
*/
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int[]arr=new int[R*C];
        int j=R*C-1;
        int rowstart=0;
        int rowend=a.length-1;
        int colstart=0;
        int colend=a[0].length-1;
        while(rowstart<=rowend&&colstart<=colend){
            for(int i=colstart;i<=colend;i++){
                arr[j]=a[rowstart][i];
                j--;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                arr[j]=a[i][colend];
                j--;
            }
            colend--;
            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                arr[j]=a[rowend][i];
                j--;
                }
            }
    
            rowend--;
            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                arr[j]=a[i][colstart];
                j--;
                }
            }
            
            colstart++;
        }
        return arr;
    }
}
