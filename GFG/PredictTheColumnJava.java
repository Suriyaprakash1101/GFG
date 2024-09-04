//predict the column-java
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int i=0;
	    int[]arr=new int[a[0].length];
	    while(i<a.length){
	        int z=sum(a,i);
	        arr[i]=z;
	        i++;
	    }
	    int max=0;
	    
	    for(int k=0;k<arr.length;k++){
	        if(arr[max]<arr[k]){
	            max=k;
	        }
	    }
	    
	    
	    
	    return max;
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

