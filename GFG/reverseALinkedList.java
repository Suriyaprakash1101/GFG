//reverse the linkedlist
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null){
            return head;
            
        }
        Node pre=null;//initilise the value of pre as null.we can store the reverse value in this variabale.
        Node s=head;
        Node next=s.next;//it use to initilize the value of s after assigned to pre.
        while(s!=null){
            s.next=pre;//to change the pointer to the reverse order
            pre=s;
            s=next;//next variable contains all the other variable with address of the remaining value in the given linkedlist
            if(next!=null){
                next=next.next;//every time next value is changed to the next value in the linkedlist.
                
            }
        }
        return pre;
    }
}

