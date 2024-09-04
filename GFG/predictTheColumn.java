//predict the column 
class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int i=0;
	    int[]a=new int[arr[0].length];
	    while(i<arr.length){
	        int z=sum(arr,i);
	        a[i]=z;
	        i++;
	    }
	    int max=a[0];
	    
	    for(int k=0;k<a.length;k++){
	        if(max<a[k]){
	            max=a[k];
	        }
	    }
	    if(max==-1){
	        return max;
	    }
	    for(int j=0;j<a.length;j++){
	        if(max==a[j]){
	            return j;
	        }
	    }
	    
	    return -1;
    }
    static int sum(int[][]arr,int col){
	    int sum=0;
	    for(int j=0;j<arr.length;j++){
	        if(arr[j][col]==0){
	            sum=sum+1;
	        }else{
	            continue;
	        }
	    }if(sum==0){
	        return -1;
	    }
	    return sum;
	}
}

