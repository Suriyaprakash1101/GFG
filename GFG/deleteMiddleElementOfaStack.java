class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid=0;
        if(sizeOfStack%2!=0){
            
        
            mid=(int)Math.ceil((sizeOfStack+1)/2);
        }
        else{
            mid=(int)Math.ceil((sizeOfStack)/2)+1;
        }
        
        
        Stack<Integer>stack=new Stack<>();
        for(int i=1;i<mid;i++){
            int ans=s.pop();
            stack.push(ans);
        }
        s.pop();
        while(!stack.isEmpty()){
            int ans=stack.pop();
            s.push(ans);
        }
        
        
    } 
}


