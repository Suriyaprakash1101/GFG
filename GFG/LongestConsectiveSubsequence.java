/*
Longest Consecutive Subsequence
Difficulty: MediumAccuracy: 33.0%Submissions: 351K+Points: 4Average Time: 25m
Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
Output: 4
Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.
Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
Output: 7
Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.
Constraints:
1 <= arr.size() <= 105
0 <= arr[i] <= 105


*/
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int len=0;
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],false);
            
        }
        for(int num:arr){
            int currlength=1;
            int nxtnum=num+1;
            while(map.containsKey(nxtnum)&&!map.get(nxtnum)){
                currlength++;
                map.put(nxtnum,true);
                nxtnum++;
            }
            int prevnum=num-1;
            while(map.containsKey(prevnum)&&!map.get(prevnum)){
                currlength++;
                map.put(prevnum,true);
                prevnum--;
            }
            len=Math.max(len,currlength);
        }
        return len;
    }
}
