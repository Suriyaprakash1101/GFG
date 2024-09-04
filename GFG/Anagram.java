//anagram
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        a=a.toUpperCase();
        b=b.toUpperCase();
        char[]ch1=a.toCharArray();
        char[]ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length!=ch2.length){
            return false;
        }
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
        
        
    }
}

