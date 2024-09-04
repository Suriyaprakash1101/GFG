//check whether the kth bit is set or not
class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        ArrayList<Integer>l=new ArrayList<>();
        
	    int rem=0;
	    while(n>0){
	        rem=n%2;
	        l.add(rem);
	        n=n/2;
	    }
	    if(k>=l.size()){
            return false;
        }
	    if(l.get(k)==1){
	        return true;
	    }
	    return false;
    }
    
}

