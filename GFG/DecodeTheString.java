/*
Decode the string
Difficulty: MediumAccuracy: 44.28%Submissions: 59K+Points: 4Average Time: 10m
Given an encoded string s, the task is to decode it. The encoding rule is :

k[encodedString], where the encodedString inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer, and encodedString contains only lowercase english alphabets.
Note: The test cases are generated so that the length of the output string will never exceed 105 .

Examples:

Input: s = "1[b]"
Output: "b"
Explanation: "b" is present only one time.
Input: s = "3[b2[ca]]"
Output: "bcacabcacabcaca"
Explanation:
1. Inner substring “2[ca]” breakdown into “caca”.
2. Now, new string becomes “3[bcaca]”
3. Similarly “3[bcaca]” becomes “bcacabcacabcaca ” which is final result.
Constraints:
1 ≤ |s| ≤ 105 
1 <= k <= 100


*/

class Solution {
    static String decodeString(String s) {
        // code here
        Stack<String>string=new Stack<>();
        Stack<Integer>num=new Stack<>();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
             k=(k*10)+((int)s.charAt(i)-(int)'0');
             continue;
            }
            if(s.charAt(i)=='['){
                num.push(k);
                k=0;
                string.push(String.valueOf(s.charAt(i)));
                continue;
            }
            if(s.charAt(i)!=']'){
                string.push(String.valueOf(s.charAt(i)));
                continue;
            }
            StringBuilder sb=new StringBuilder();
            while(!string.peek().equals("[")){
                sb.insert(0,string.pop());
            }
            StringBuilder tem=new StringBuilder();
            string.pop();
            int val=num.pop();
            for(int z=0;z<val;z++){
                tem.append(sb);
            }
            string.push(tem.toString());
        }
        StringBuilder res=new StringBuilder();
        while(!string.isEmpty()){
            res.insert(0,string.pop());
        }
        return res.toString();
    }
}
