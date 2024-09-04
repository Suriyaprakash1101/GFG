//stack designer
public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
    //Your code here
    Stack<Integer>stack=new Stack<>();
    for(int i=0;i<arr.size();i++){
        int ans=arr.get(i);
        stack.push(ans);
    }
    return stack;
    
}

public static void _pop(Stack<Integer>s)
{
    //Your code here
    while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
    }
}

