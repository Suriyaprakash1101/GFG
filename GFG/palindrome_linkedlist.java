//find the given linkedlist is palindrome or not
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node t=head;
        ArrayList<Integer>list=new ArrayList<>();
        while(t!=null){
            list.add(t.data);
            t=t.next;
        }
        boolean z=false;
        int i=0;
        int j=list.size()-1;
        while(i<list.size()&&j>=0){
            if(list.get(i)==list.get(j)){
                z=true;
                i++;
                j--;
            }else{
                z=false;
                return z;
            }
        }
        return z;
    }    
}


