//number of 1 bits
class Solution {
    static int setBits(int N) {
        // code here
        ArrayList<Integer>l=new ArrayList<>();
        int count=0;
	    int rem=0;
	    while(N>0){
	        rem=N%2;
	        l.add(rem);
	        N=N/2;
	    }
	    for(int i=0;i<l.size();i++){
	        if(l.get(i)==1){
	            count++;
	        }
	    }
	    return count;
    }
}

