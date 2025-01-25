/*
Find the first node of loop in linked list
Difficulty: EasyAccuracy: 55.49%Submissions: 52K+Points: 2
Given a head of the singly linked list. If a loop is present in the list then return the first node of the loop else return NULL.

Custom Input format:
A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.

Examples:

Input:
 
Output: 3
Explanation: We can see that there exists a loop in the given linked list and the first node of the loop is 3.
Input:
 
Output: -1
Explanation: No loop exists in the above linked list.So the output is -1.
Constraints:
1 <= no. of nodes <= 106
1 <= node->data <= 106 
*/
class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node fast=head;
        Node slow=head;
        boolean b=false;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                b=true;
                break;
            }
        }
        if(b){
            Node tem=head;
            while(tem!=null){
                
                if(tem==slow){
                    return tem;
                }
                tem=tem.next;
                slow=slow.next;
            }
        }
        Node res=new Node(-1);
        return res;
    }
}
