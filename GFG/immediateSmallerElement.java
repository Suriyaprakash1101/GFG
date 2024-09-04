//immediate smaller element
class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                arr[i]=arr[i+1];
            }else{
                arr[i]=-1;
            }
        }
        arr[n-1]=-1;
    }
}
