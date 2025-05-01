/*
Overlapping Intervals
Difficulty: MediumAccuracy: 57.41%Submissions: 101K+Points: 4
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

Examples:

Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
Output: [[1,4], [6,8], [9,10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].
Input: arr[][] = [[6,8],[1,9],[2,4],[4,7]]
Output: [[1,9]]
Explanation: In the given intervals all the intervals overlap with the interval [1,9]. Therefore we will return [1,9].
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ starti ≤ endi ≤ 105

*/

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        ArrayList<int[]>l=new ArrayList<>();
        if(arr.length<=1){
            l.add(arr[0]);
            return l;
        }
        Arrays.sort(arr,Comparator.comparingInt(i->i[0]));
        l.add(arr[0]);
        int[]interval=arr[0];
        for(int[] intervals:arr){
            if(interval[1]>=intervals[0]){
                interval[1]=Math.max(interval[1],intervals[1]);
            }
            else{
                interval=intervals;
                l.add(interval);
            }
        }
        return l;
    }
}
