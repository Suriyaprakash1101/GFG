//stack using two queues
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    Stack<Integer>stack=new Stack<>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    stack.push(a);
	    
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(stack.isEmpty()){
	        return -1;
	    }
	    int ans=stack.pop();
	    return ans;
    }
	
}


