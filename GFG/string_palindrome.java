//the given string is palindrome or not:
class Solution {
    int isPalindrome(String S) {
        // code here
        char[]ch=S.toCharArray();
	    int j=ch.length-1;
	    int res=0;
	    for(int i=0;i<ch.length/2;i++){
	        if(ch[i]==ch[j]){
	            res=1;
	            j--;
	        }else{
	            res=0;
	            return res;
	        }
	    }
	    return res;
        
        
    }
}
