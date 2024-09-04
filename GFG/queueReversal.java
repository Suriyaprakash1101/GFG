//queue reversal
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            int ans=q.remove();
            s.push(ans);
        }
        
        while(!s.isEmpty()){
            int ans=s.pop();
            q.add(ans);
        }
        return q;
    }
}

