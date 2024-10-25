/*
Given a BST and an integer K. Find the Kth Smallest element in the BST using O(1) extra space. 

Example 1:

Input:
      2
    /   \
   1     3
K = 2
Output: 2
Explanation: 2 is the 2nd smallest element in the BST

Example 2:

Input:
        2
      /  \
     1    3
K = 5
Output: -1
Explanation: There is no 5th smallest element in the BST as the size of BST is 3
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function KthSmallestElement() which takes the root of the BST and integer K as inputs and returns the Kth smallest element in the BST, if no such element exists return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1<=Number of nodes<=10^5
*/
class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        
        ArrayList<Integer>l=new ArrayList<>();
        Queue<Node>q=new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            Node current=q.poll();
            int val=current.data;
            l.add(val);
            if(current.left!=null){
                q.offer(current.left);
            }
            if(current.right!=null){
                q.offer(current.right);
            }
        }
        Collections.sort(l);
        if(l.size()<K){
            return -1;
        }
        return l.get(K-1);
    }
}


