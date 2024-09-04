//Reverse the first k elements of queue
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        int[]a=new int[q.size()];
        int j=k-1;
        for(int i=0;i<a.length;i++){
            int b=q.remove();
            if(i<k){
                a[j]=b;
                j--;    
            }
            else{
               a[i]=b; 
            }
            
            
        }
        Queue<Integer>p=new LinkedList<>();
        for(int i=0;i<a.length;i++){
            p.add(a[i]);
        }
        return p;
        
        
    }
}



