
//minimum element in the given arange
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        
        int min=arr[0];
        for(int i=low;i<=high;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    
    }
}
