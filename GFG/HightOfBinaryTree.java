/*
Height of Binary Tree
Difficulty: EasyAccuracy: 78.58%Submissions: 322K+Points: 2Average Time: 15m
Given a binary tree, find its height.

The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children.

Examples:

Input: root[] = [12, 8, 18, 5, 11] 
 
Output: 2
Explanation: One of the longest path from the root (node 12) goes through node 8 to node 5, which has 2 edges.
Input: root[] = [1, 2, 3, 4, N, N, 5, N, N, 6, 7]  

Output: 3
Explanation: The longest path from the root (node 1) to a leaf node 6 with 3 edge.
Constraints:
1 <= number of nodes <= 105
0 <= node->data <= 105


*/
class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        int[]a=new int[1];
        recursion(node,a,0);
        return a[0];
        
    }
    public static void recursion(Node head,int[]a,int count){
        if(head==null){
            a[0]=Math.max(count-1,a[0]);
            return;
        }
        recursion(head.left,a,count+1);
        recursion(head.right,a,count+1);
    }
    
}
