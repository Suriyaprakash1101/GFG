/*
Longest Common Prefix of Strings
Difficulty: EasyAccuracy: 29.52%Submissions: 297K+Points: 2
Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There's no common prefix in the given strings.
Constraints:
1 ≤ |arr| ≤ 103
1 ≤ |arr[i]| ≤ 103
*/
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuffer sb=new StringBuffer();
        int lensmall=small(arr);
        for(int i=0;i<arr[lensmall].length();i++){
            char c=arr[lensmall].charAt(i);
            for(int j=0;j<arr.length;j++){
                if(c!=arr[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static int small(String[] a){
        int ind=0;
        for(int i=1;i<a.length;i++){
            if(a[ind].length()>a[i].length()){
                ind=i;
            }
        }
        return ind;
    }
}
