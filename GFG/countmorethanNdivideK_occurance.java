//count more than n/k occurence
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int div=n/k;
	    int count=0;
	   HashMap<Integer,Integer>m=new HashMap<>();
	   for(int i:arr){
	       if(m.containsKey(i)){
	           m.put(i,m.get(i)+1);
	       }else{
	           m.put(i,1);
	       }
	   }
	   for(int key:m.keySet()){
	       if(m.get(key)>div){
	           count++;
	       }
	   }
	   return count;
    }
}
