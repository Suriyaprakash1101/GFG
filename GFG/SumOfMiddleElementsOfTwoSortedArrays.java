//sum of the middle elements of two sorted arrays
class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int sum=0;
        int[]a=new int[2*n];
        int i=0;
        int j=0;
        int k=0;
        while(i<ar1.length&&j<ar2.length){
            if(ar1[i]<=ar2[j]){
                a[k]=ar1[i];
                i++;
                k++;
            }
            else{
                a[k]=ar2[j];
                j++;
                k++;
            }
        }
        while(i<ar1.length){
            a[k]=ar1[i];
            i++;
            k++;
        }
        while(j<ar2.length){
            a[k]=ar2[j];
            j++;
            k++;
        }
        sum=a[n-1]+a[n];
        return sum;
    }
}

