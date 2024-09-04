//find the missing elements in the array
class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=n*(n+1)/2;
        int s=0;
        for(int i=0;i<array.length;i++){
            s=s+array[i];
        }
        int result=sum-s;
        return result;
        
    }
}
