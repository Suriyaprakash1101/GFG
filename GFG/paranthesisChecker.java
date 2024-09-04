//parenthesis checker
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        char[]ch=x.toCharArray();
        
        Stack<Character>stack=new Stack<>();
        for(char c:ch){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if(c==')'&&top=='('||c==']'&&top=='['||c=='}'&&top=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


