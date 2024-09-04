//non-repeating character
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        ArrayList<Character>l=new ArrayList<>();
        for(int i=0;i<S.length();i++){
            if(!l.contains(S.charAt(i))){
                l.add(S.charAt(i));
            }
        }
        for(int i=0;i<l.size();i++){
            char c=l.get(i);
            int count=0;
            for(int j=0;j<S.length();j++){
                if(c==S.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return c;
            }
        }
        return '$';
    }
}

