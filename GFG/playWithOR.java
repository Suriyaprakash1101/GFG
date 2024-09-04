//play with or 
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        int[]a=new int[n];
        if(arr.length==1){
            a[0]=arr[0];
            return a;
        }
        int val=0;
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            val=arr[i]|arr[i+1];
            a[j]=val;
            j++;
        }
        val=arr[n-1];
        while(j<arr.length){
            a[j]=val;
            j++;
        }
        return a;
        
        
        
    }
    
    
}

