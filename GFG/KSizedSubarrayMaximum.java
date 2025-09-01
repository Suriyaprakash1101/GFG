/*
K Sized Subarray Maximum
Difficulty: MediumAccuracy: 26.04%Submissions: 404K+Points: 4
Given an array arr[] of positive integers and an integer k. You have to find the maximum value for each contiguous subarray of size k. The output should be an array of maximum values corresponding to each contiguous subarray.

Examples:

Input: arr[] = [1, 2, 3, 1, 4], k = 3
Output: [3, 3, 4]
Explanation: 
1st contiguous subarray [1, 2, 3], max = 3
2nd contiguous subarray [2, 3, 1], max = 3
3rd contiguous subarray [3, 1, 4], max = 4
Input: arr[] = [8, 5, 10, 7, 9, 4, 15, 12], k = 4
Output: [10, 10, 10, 15, 15]
Explanation: 
1st contiguous subarray [8, 5, 10, 7], max = 10
2nd contiguous subarray [5, 10, 7, 9], max = 10
3rd contiguous subarray [10, 7, 9, 4], max = 10
4th contiguous subarray [7, 9, 4, 15], max = 15
5th contiguous subarray [9, 4, 15, 12], max = 15
Input: arr[] = [5, 1, 3, 4, 2], k = 1
Output: [5, 1, 3, 4, 2]
Explanation: When k = 1, each element in the array is its own subarray, so the output is simply the same array
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ k ≤ arr.size()
0 ≤ arr[i] ≤ 109

*/


class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        Deque<Integer>deq=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            while(!deq.isEmpty()&&deq.peekFirst()<=i-k){
                deq.pollFirst();
            }
            while(!deq.isEmpty()&&arr[deq.peekLast()]<=arr[i]){
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){
                list.add(arr[deq.peekFirst()]);
            }
        }
        return list;
    }
}
/*
Algorithm:
we create deque and arrange the element in descending order.
we maintain the window right, so if the value in top of the deque is not in the window then remove it(i-k) represents the before first position of the window
as I said earlier the deque contains element in descending order, it deque last element is less than the current one then we remove it because their is no use
of smallest one it this problem, 
after i use offerLast method to insert index, if i>=k-1 then we have first windown and we do upcoming window also.
*/
