/*
Given a Binary Tree, find maximum and minimum elements in it.

Example:

Input: 
           
Output: 11 1
Explanation: The maximum and minimum element in this binary tree is 11 and 1 respectively.
Input: 
           6
        / \
       5   8
      /
     2
Output: 8 2
Explanation: The maximum and minimum element in this binary tree is 8 and 2 respectively.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= number of nodes <= 105
1 <= data of a node <= 105*/

class Solution{
    public static int findMax(Node root){
        //code here
        int max=root.data;
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            int val=current.data;
            if(val>max){
                max=val;
            }
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
        }
        return max;
            
        
    }
    public static int findMin(Node root){
        //code here
        int min=root.data;
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            int val=current.data;
            if(val<min){
                min=val;
            }
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
        }
        return min;
    }
}
