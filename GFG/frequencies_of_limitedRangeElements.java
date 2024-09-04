//frequencies of limited range elements in array
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        //int n=arr.length;
	    arr=find(arr,N);
	    
    }
    public static int[] find(int[]arr,int N){
        int[]a=new int[N];
	    for(int i=0;i<N;i++){
	        if(arr[i]>N){
	            continue;
	        }else{
	            a[arr[i]-1]=a[arr[i]-1]+1;
	        }
	    }
	    for(int i=0;i<a.length;i++){
	        arr[i]=a[i];
	    }
	    return arr;
    }
}

