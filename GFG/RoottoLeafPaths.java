/*
Root to Leaf Paths
Difficulty: MediumAccuracy: 43.65%Submissions: 146K+Points: 4Average Time: 30m
Given a Binary Tree, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.

Note: The paths should be returned such that paths from the left subtree of any node are listed first, followed by paths from the right subtree.

Examples:

Input: root[] = [1, 2, 3, 4, 5, N, N]
ex-3
Output: [[1, 2, 4], [1, 2, 5], [1, 3]]
Explanation: All the possible paths from root node to leaf nodes are: 1 -> 2 -> 4, 1 -> 2 -> 5 and 1 -> 3
Input: root[] = [1, 2, 3]

Output: [[1, 2], [1, 3]] 
Explanation: All the possible paths from root node to leaf nodes are: 1 -> 2 and 1 -> 3
Input: root[] = [10, 20, 30, 40, 60, N, N]

Output: [[10, 20, 40], [10, 20, 60], [10, 30]]
Explanation: All the possible paths from root node to leaf nodes are: 10 -> 20 -> 40, 10 -> 20 -> 60 and 10 -> 30
Constraints:
1 <= number of nodes <= 104
1 <= node->data <= 104
*/
class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>tem=new ArrayList<>();
        find(root,res,tem);
        return res;
    }
    public static void find(Node root,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>tem){
        if(root.left==null&&root.right==null){
            tem.add(root.data);
            res.add(new ArrayList<>(tem));
            return;
            
        }
        tem.add(root.data);
        if(root.left!=null){
            find(root.left,res,tem);
            tem.remove(tem.size()-1);
        }
        
        if(root.right!=null){
            find(root.right,res,tem);
            tem.remove(tem.size()-1);
        }
       
    }
}
