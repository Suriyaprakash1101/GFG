//find how many nodes in the given linkedlist
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int count=0;
        Node s=head;
        while(s!=null){
            count++;
            s=s.next;
        }
        return count;
    }
}
    
