/*
Missing element of AP
Difficulty: MediumAccuracy: 34.32%Submissions: 46K+Points: 4
Given a sorted array arr[] that represents an Arithmetic Progression (AP) with exactly one missing element, find the missing number.

Note: An element will always exist that, upon inserting into a sequence forms Arithmetic progression. If the given sequence already forms a valid complete AP, return the (n+1)-th element that would come next in the sequence.

Examples:

Input: arr[] = [2, 4, 8, 10, 12, 14]
Output: 6
Explanation: Actual AP should be 2, 4, 6, 8, 10, 12, 14.
Input: arr[] = [1, 6, 11, 16, 21, 31]
Output: 26
Explanation: Actual AP should be 1, 6, 11, 16, 21, 26, 31.
Input: arr[] = [4, 7, 10, 13, 16]
Output: 19
Explanation: Since the sequence already forms a valid AP, the next element after 16 in the sequence would be 19. Therefore, the output is 19.
Constraints:
2 <= arr.size() <= 105
0 <= arr[i] <= 2*107
*/
class Solution {
    public int findMissing(int[] arr) {
        // code here
        int a=arr[0];
        int d=arr[1]-arr[0];
        boolean b=false;
        for(int i=2;i<arr.length;i++){
            if(!(a+(i*d)==arr[i])){
                b=true;
                return a+(i*d);
            }
        }
        return a+(arr.length*d);
    }
}
