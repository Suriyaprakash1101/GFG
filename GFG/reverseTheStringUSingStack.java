//reverse the string using stack
class Solution {
    
    public String reverse(String S){
        //code here
        char[] ch=S.toCharArray();
        Stack<Character>stack=new Stack<>();
        for(char i:ch){
            stack.push(i);
        }
        for(int j=0;j<S.length();j++){
            ch[j]=stack.pop();
        }
        //String s=new String(ch);
        return new String(ch);
        
    }

}

