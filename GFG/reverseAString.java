//reverse a string
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuffer sr=new StringBuffer();
        while(!s.isEmpty()){
            sr.append(s.pop());
        }
        String stri=sr.toString();
        return stri;
    }
}

