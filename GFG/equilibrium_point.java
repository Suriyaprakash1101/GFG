//equilibrium point 
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum=0;
        long left=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            if(left==sum){
                int index=i+1;
                return index;
            }
            left=left+arr[i];
        }
        return -1;
    }
}

