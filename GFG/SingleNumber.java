/*
Given an array arr[] of positive integers where every element appears even times except for one. Find that number occurring an odd number of times.

Examples:

Input: arr[] = [1, 1, 2, 2, 2]
Output: 2
Explanation: In the given array all element appear two times except 2 which appears thrice.
Input: arr[] = [8, 8, 7, 7, 6, 6, 1]
Output: 1
Explanation: In the given array all element appear two times except 1 which appears once.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
*/

class Solution {
    int getSingle(int arr[]) {
        // code here
        int i=0;
        int j=1;
        Arrays.sort(arr);
        int count=1;
        while(i<arr.length-1&&j<arr.length){
            if(arr[i]==arr[j]){
                count++;
                j++;
            }
            else{
                if(count%2!=0){
                    return arr[i];
                }
                else{
                    count=1;
                    i=j;
                    j=i+1;
                }
            }
        }
        if(count%2!=0){
            return arr[i];
        }
        return -1;
    }
}
