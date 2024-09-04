class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    
	    int count=0;
	    Node s=head1;
	    while(s!=null){
	        count++;
	        s=s.next;
	    }
	    if(count%2==0){
	        return 0;
	    }
	   
	    return 1;
	}
}
