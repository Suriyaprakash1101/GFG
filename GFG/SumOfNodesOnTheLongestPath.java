/*
Sum of nodes on the longest path
Difficulty: MediumAccuracy: 52.39%Submissions: 114K+Points: 4
Given a binary tree root[], you need to find the sum of the nodes on the longest path from the root to any leaf node. If two or more paths have the same length, the path with the maximum sum of node values should be considered.

Examples:

Input: root[] = [4, 2, 5, 7, 1, 2, 3, N, N, 6, N]
 
Output: 13
Explanation:

The highlighted nodes (4, 2, 1, 6) above are part of the longest root to leaf path having sum = (4 + 2 + 1 + 6) = 13
Input: root[] = [1, 2, 3, 4, 5, 6, 7]

Output: 11
Explanation: 

The longest root-to-leaf path is 1 -> 3 -> 7, with sum 11.
Input: root[] = [10, 5, 15, 3, 7, N, 20, 1]

Output: 19
Explanation: 

The longest root-to-leaf path is 10 -> 5 -> 3 -> 1 with a sum of 10 + 5 + 3 + 1 = 19.
Constraints:
1 <= number of nodes <= 106
0 <= node->data <= 104
*/
class Solution {
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        int[]a=recursion(root);
        return a[1];
        
    }
    public static int[] recursion(Node root){
        if(root==null){
            int[]arr={0,0};
            return arr;
        }
        int[]left=recursion(root.left);
        int[]right=recursion(root.right);
        int[]ans=new int[2];
        if(left[0]>right[0]){
            ans[0]=left[0]+1;
            ans[1]=left[1]+root.data;
        }
        else if(left[0]==right[0]){
            if(left[1]>right[1]){
                ans[0]=left[0]+1;
                ans[1]=left[1]+root.data;
            }
            else{
                ans[0]=right[0]+1;
                ans[1]=right[1]+root.data;
            }
        }
        else{
            ans[0]=right[0]+1;
            ans[1]=right[1]+root.data;
        }
        return ans;
    }
}
