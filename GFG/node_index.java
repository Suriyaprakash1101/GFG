//find the node at the given index
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node s=node;
       for(int i=1;i<ind;i++){
           s=s.next;
       }
       int a=s.data;
       return a;
    }
}
