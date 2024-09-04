//Nth node from end of linked list
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	
    	int count=0;
    	Node s=head;
    	Node t=head;
    	while(s!=null){
    	    count++;
            s=s.next;
    	}
    	if(n>count){
    	    return -1;
    	}
    	int a=count-n;
    
    	for(int i=0;i<a;i++){
    	    t=t.next;
    	}
    	return t.data;
    	
    }
}

