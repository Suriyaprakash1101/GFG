//Second largest element in the given array
class Solution {
    int print2largest(int arr[], int n) {
        // code here
    //   ArrayList<Integer>l=new ArrayList<>();
        int[]a=new int[arr.length];
       int firstmax=greatest(arr);
       int j=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=firstmax){
              a[j]=arr[i];
              j++;
           }
           else{
               a[j]=-1;
               j++;
           }
       }
       for(int z:a){
           if(z==0){
               return -1;
           }
       }
       
       int ans=greatest(a);
       return ans;
	}
	public static int greatest(int[]a){
	    int max=0;
	    for(int i=0;i<a.length;i++){
	        if(a[max]<a[i]){
	            a[max]=a[i];
	        }
	    }
	    return a[max];
	}
	
}
