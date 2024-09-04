//search the element in the given array
class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==X){
                return i;
            }else{
                continue;
            }
        }
        return -1;
        
    }
    
}


