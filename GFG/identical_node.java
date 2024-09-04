//The given two node is identical or not
class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        int count1=0;
        int count2=0;
        Node s=head1;
        Node t=head2;
        Node a=head1;
        Node b=head2;
        while(a!=null){
            count1++;
            a=a.next;
        }while(b!=null){
            count2++;
            b=b.next;
        }
        if(count1!=count2){
            return false;
        }else{
            while(s!=null &&t!=null){
                if(s.data==t.data){
                    s=s.next;
                    t=t.next;
                }else{
                    return false;
                }
            }
            
        }
        
        return true;
    }
}
