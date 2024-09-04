//minimum element in the given array
class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
