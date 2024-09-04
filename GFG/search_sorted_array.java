//search the element in the sorted array
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(K>arr[mid]){
                s++;
            }else if(K<arr[mid]){
                e--;
            }else if(K==arr[mid]){
                return 1;
            }
        }
        return -1;
        
    }
}
//another solution
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int s=0;
        int target=K;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
           
            if(arr[mid]==target){
                
                return 1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
        }
        return -1;
        
    }
}

