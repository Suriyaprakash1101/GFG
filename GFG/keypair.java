//key pair
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                continue;
            }
            else{
                int s=x-arr[i];
                for(int j=i+1;j<arr.length;j++){
                    if(s==arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

