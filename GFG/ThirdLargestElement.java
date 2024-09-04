//third largest element in the given array
class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    ArrayList<Integer>l=new ArrayList<>();
	    for(int i=0;i<a.length;i++){
	        if(!l.contains(a[i])){
	            l.add(a[i]);
	        }
	    }
	    Collections.sort(l);
	    int val=l.get(l.size()-3);
	    return val;
    }
}

