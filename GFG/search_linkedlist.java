//search in given linkedlist
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node s=head;
        while(s!=null){
            if(s.data==key){
                return true;
            }else{
                s=s.next;
            }
        }
        return false;
    }
}
