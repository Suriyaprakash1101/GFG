//reverse words in a given string
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        StringBuffer sb=new StringBuffer();
        String[] st=S.split("\\.");
        for(int i=st.length-1;i>0;i--){
            sb.append(st[i]);
            sb.append(".");
        }
        sb.append(st[0]);
        String str=sb.toString();
        return str;
        
        
    }
}

