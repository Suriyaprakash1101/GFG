/*
Sorted insert for circular linked list
Difficulty: MediumAccuracy: 25.56%Submissions: 120K+Points: 4
Given a sorted circular linked list, the task is to insert a new node in this circular list so that it remains a sorted circular linked list.

Examples:

Input: LinkedList: 1->2->4 (the first and last node is connected, i.e. 4 -> 1), data = 2
Output: 1->2->2->4
Explanation: We can add 2 after the second node.

Input: LinkedList = 1->4->7->9 (the first and last node is connected, i.e. 9 --> 1), data = 5
Output: 1->4->5->7->9
Explanation: We can add 5 after the second node.

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
2 <= number of nodes <= 106
0 <= node->data <= 106
0 <= data <= 106
*/
class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node n=new Node(data);
        Node s=head;
        Node pre=head;
        while(pre!=null){
            if(pre.data<=data&&pre.next.data>data){
                n.next=pre.next;
                pre.next=n;
               break;
            }
            if(pre.data==data){
                n.next=pre.next;
                pre.next=n;
               break;
            }
            if(pre.data>pre.next.data){
                n.next=pre.next;
                pre.next=n;
                if(pre.data>data){
                    head=n;
                }
                
                break;
            }
            pre=pre.next;
        }
        Node t=head;
        return t;
    }
}
