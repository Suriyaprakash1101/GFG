/*
Add all greater values to every node in a BST
Difficulty: MediumAccuracy: 59.39%Submissions: 35K+Points: 4
Given a BST, modify it so that all greater values in the given BST are added to every node.

Example 1:

Input:
           50
         /    \
        30    70
      /  \     / \  
     20  40 60 80
Output: 350 330 300 260 210 150 80
Explanation:The tree should be modified to
following:
             260
          /       \
        330      150
       /   \      /     \
    350   300 210    80
Example 2:

Input:
          2
        /   \
       1     5
            /  \
           4    7
Output: 19 18 16 12 7
Your Task:
You don't need to read input or print anything. Your task is to complete the function modify() which takes one argument: the root of the BST. The function should contain the logic to modify the BST so that in the modified BST, every node has a value equal to the sum of its value in the original BST and values of all the elements larger than it in the original BST. Return the root of the modified BST. The driver code will print the inorder traversal of the returned BST/

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1<=N<=100000


Note: The Input/Output format and Example is given are used for the system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from the stdin/console. The task is to complete the function specified, and not to write the full code.
*/
class Solution {

    // modify the BST and return its root
    public Node modify(Node root) {
        // Write your code here
        ArrayList<Integer>l=new ArrayList<>();
        Addlist(root,l);
        Collections.sort(l);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<l.size();i++){
            map.put(l.get(i),i);
        }
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
            l.remove(i);
            l.add(i,sum);
        }
        Change(root,map,l);
        return root;
    }
    public static void Addlist(Node root,ArrayList<Integer>l){
        if(root==null){
            return;
        }
        l.add(root.data);
        Addlist(root.left,l);
        Addlist(root.right,l);
    }
    public static void Change(Node root,HashMap<Integer,Integer>map,ArrayList<Integer>l){
        if(root==null){
            return;
        }
        
        int index=map.get(root.data);
        root.data=index>0?l.get(l.size()-1)-l.get(index-1):l.get(l.size()-1);
        Change(root.left,map,l);
        Change(root.right,map,l);
    }
}
