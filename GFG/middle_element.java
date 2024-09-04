//find the middle of the linkedlist
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node s=head;
         Node t=head;
         int count=0;
         while(s!=null){
             count++;
             s=s.next;
         }
         int mid=count/2;
         for(int i=0;i<mid;i++){
             t=t.next;
         }
         return t.data;
        
    }
}

