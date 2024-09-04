//sort a Stack
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		int[]a=new int[s.size()];
		int j=0;
		while(!s.isEmpty()){
		    int ans=s.pop();
		    a[j]=ans;
		    j++;
		}
		sort(a);
		for(int i=0;i<a.length;i++){
		    int ans=a[i];
		    s.push(ans);
		}
		return s;
	}
	static void sort(int[]a){
	    for(int i=0;i<a.length;i++){
	        for(int j=1;j<a.length-i;j++){
	            if(a[j]<a[j-1]){
	                int tem=a[j];
	                a[j]=a[j-1];
	                a[j-1]=tem;
	            }
	        }
	    }
	}
}


