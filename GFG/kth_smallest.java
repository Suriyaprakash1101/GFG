//kth smallest number in an array
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code her
        Arrays.sort(arr);
        int element=arr[k-1];
        return element;
        
    } 
}
