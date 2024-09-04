//reverse the stack

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        int n=s.size();
        int[]a=new int[n];
        int i=0;
        while(!s.isEmpty()){
            int ans=s.pop();
            a[i]=ans;
            i++;
        }
        for(int j=0;j<a.length;j++){
            int ans=a[j];
            s.push(ans);
        }
        
    }
}


