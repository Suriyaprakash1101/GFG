//remove all duplivates from a given string
class Solution {
    String removeDuplicates(String str) {
        char[]c=str.toCharArray();
	    StringBuffer sb=new StringBuffer();
	    ArrayList<Character>l=new ArrayList<>();
	    for(char ch:c){
	        if(!l.contains(ch)){
	            sb.append(ch);
	            l.add(ch);
	        }
	    }
	    return sb.toString();
    }
}


