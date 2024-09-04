//find n/k th node of the linkedlist
class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int count=0;
       Node s=head;
       Node t=head;
       while(s!=null){
           count++;
           s=s.next;
       }
       double a=(double)count/k;
        int b=(int)Math.ceil(a);
       for(int i=1;i<b;i++){
           t=t.next;
       }
       return t.data;
    }
}

