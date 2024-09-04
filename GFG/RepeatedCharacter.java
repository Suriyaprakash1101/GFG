//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        // your code here
        for(int i=0;i<S.length()-1;i++){
            for(int j=i+1;j<S.length();j++){
                char c=S.charAt(i);
                char ch=S.charAt(j);
                if(c==ch){
                    return c;
                }
                else{
                    continue;
                }
            }
        }
        char c='#';
        return c;
    }
}

