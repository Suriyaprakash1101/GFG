/*
iven a Binary tree. Find the level in the binary tree which has the maximum number of nodes.

Examples:

Input:
      2
    /    \ 
   1      3
 /   \     \
4    6      8
     / 
    5
Output: 2
Explanation: The level 2 with nodes 4, 6 and 8 is the level with maximum number of nodes. 
Input:
      2
    /    \ 
   1      3
 /   \     \
4    7      8
     / 
    5
Output: 2
Explanation: The level 2 with nodes 4, 7 and 8 is the level with maximum number of nodes. 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1<=Number of level<=105*/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int item)
	{
	    data = item;
	    left = right = null;
	}
}
*/
class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        // add your code here
        int max=0;
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        int level=1;
        int maxlevel=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            if(max<len){
                max=len;
                maxlevel=level-1;
            }
            for(int i=0;i<len;i++){
                Node current=queue.poll();
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            level++;
        }
        return maxlevel;
    }
}
