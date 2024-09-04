//bitonic point 
class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int max=arr[0];
        
    
        for(int z=0;z<arr.length;z++){
            if(max<arr[z]){
                max=arr[z];
            }
        }
        
        return max;
    }
}
