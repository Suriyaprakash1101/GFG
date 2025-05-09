/*
Count BST nodes that lie in a given range
Difficulty: MediumAccuracy: 64.84%Submissions: 96K+Points: 4Average Time: 45m
Given a Binary Search Tree (BST) and a range l-h (inclusive), your task is to return the number of nodes in the BST whose value lie in the given range.

Examples :

Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 5, h = 45
         
Output: 3
Explanation: There are three nodes in range [5, 45] =  5, 10 and 40.
Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 10, h = 100
         
Output: 4
Explanation: There are four nodes in range [10, 100] = 10, 40, 50 and 100.
Input: root[] = [1, 2, 3], l = 23, h = 95
         
Output: 0
Explanation: There are no nodes in range [23, 95].
Constraints:
1 <= Number of nodes <= 105
1 <= l <= h < =105
*/
class Solution {
    int getCount(Node root, int l, int h) {
        // Your code here
        int[]a=new int[1];
        countInrange(root,l,h,a);
        return a[0];
    }
    public static void countInrange(Node root,int l,int h,int[]a){
        if(root==null){
            return;
        }
        a[0]=root.data>=l&&root.data<=h?a[0]+1:a[0];
        countInrange(root.left,l,h,a);
        countInrange(root.right,l,h,a);
        
    }
}
