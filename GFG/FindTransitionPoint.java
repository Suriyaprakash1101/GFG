//find the transition point 
class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                return i;
            }else{
                continue;
            }
        }
        return -1;
    }
}

