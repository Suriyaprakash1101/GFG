class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
	    int[]b=new int[n];
	    ArrayList<Integer>list=new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	        int index=arr[i]%n;
	        b[index]=b[index]+n;
	    }
	    for(int i=0;i<b.length;i++){
	        if(b[i]/n>=2){
	            list.add(i);
	        }
	    }
	    if(list.isEmpty()){
	        list.add(-1);
	    }
	    return list;
        
    }
}
