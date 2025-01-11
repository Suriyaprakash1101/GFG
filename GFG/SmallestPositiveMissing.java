/*
Smallest Positive Missing
Difficulty: MediumAccuracy: 25.13%Submissions: 390K+Points: 4
You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.
Input: arr[] = [5, 3, 2, 5, 1]
Output: 4
Explanation: Smallest positive missing number is 4.
Input: arr[] = [-8, 0, -1, -4, -3]
Output: 1
Explanation: Smallest positive missing number is 1.
Constraints:  
1 <= arr.size() <= 105
-106 <= arr[i] <= 106


*/
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>0){
                if(arr[i]==arr[i+1]){
                    continue;
                }
               else if(arr[i]!=count){
                    return count;
                }
                
                else{
                    count++;
                }
            }
        }
        if(arr[arr.length-1]==count){
            count++;
        }
        return count;
        
    }
}
