//find the sum of the last n nodes
class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      int count=0;
      Node s=head;
      Node t=head;
      while(s!=null){
          count++;
          s=s.next;
      }
      int a=count-k;
      int sum=0;
      if(a==0){
          for(int i=0;i<count;i++){
              sum=sum+t.data;
              t=t.next;
          }
      }
      else{
          for(int i=0;i<a;i++){
              t=t.next;
          }
          while(t!=null){
              sum=sum+t.data;
              t=t.next;
          }
      }
      return sum;
    }
}
