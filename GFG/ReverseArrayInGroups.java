/*
Reverse array in groups
Difficulty: MediumAccuracy: 37.48%Submissions: 360K+Points: 4Average Time: 15m
Given an array arr[] of positive integers. Reverse every sub-array group of size k.
Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. 

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than array size, the entire array is reversed.
Constraints:
1 ≤ arr.size(), k ≤ 105
1 ≤ arr[i] ≤ 105



*/



class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int i=0;
        while(i<arr.length){
            if(i+k<=arr.length-1){
                reverse(arr,i,i+k-1);
                i=i+k;
            }
            else{
                reverse(arr,i,arr.length-1);
                break;
            }
        }
        
    }
    public static void reverse(int[]a,int s,int e){
        int i=s;
        int j=e;
        while(i<j){
            int tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--;
        }
    }
}
