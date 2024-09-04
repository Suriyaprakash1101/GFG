//insert an element at the bottom of a stack
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        ArrayList<Integer>l=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        s.push(x);
        while(!st.isEmpty()){
            int e=st.pop();
            l.add(e);
        }
        for(int i=l.size()-1;i>=0;i--){
            s.push(l.get(i));
        }
        return s;
    }
}


