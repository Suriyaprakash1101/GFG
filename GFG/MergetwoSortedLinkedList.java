/*
Merge two sorted linked lists
Difficulty: MediumAccuracy: 62.91%Submissions: 180K+Points: 4
Given the head of two sorted linked lists consisting of nodes respectively. The task is to merge both lists and return the head of the sorted merged list.

Examples:

Input: head1 = 5 -> 10 -> 15 -> 40, head2 = 2 -> 3 -> 20
Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:

Input: head1 = 1 -> 1, head2 = 2 -> 4
Output: 1 -> 1 -> 2 -> 4
Explanation:

Constraints:
1 <= no. of nodes<= 103
0 <= node->data <= 105
*/
class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy=new Node(0);
        Node pre=dummy;
        Node a=head1;
        Node b=head2;
        while(a!=null&&b!=null){
            if(a.data<=b.data){
                pre.next=a;
                a=a.next;
                pre=pre.next;
            }
            else{
                pre.next=b;
                b=b.next;
                pre=pre.next;
            }
        }
        if(a!=null){
            pre.next=a;
        }
        if(b!=null){
            pre.next=b;
        }
        return dummy.next;
    }
}
