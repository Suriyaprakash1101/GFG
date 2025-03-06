/*
Longest Palindrome in a String
Difficulty: MediumAccuracy: 23.2%Submissions: 311K+Points: 4
Given a string s, your task is to find the longest palindromic substring within s.

A substring is a contiguous sequence of characters within a string, defined as s[i...j] where 0 ≤ i ≤ j < len(s).

A palindrome is a string that reads the same forward and backward. More formally, s is a palindrome if reverse(s) == s.

Note: If there are multiple palindromic substrings with the same length, return the first occurrence of the longest palindromic substring from left to right.

Examples :

Input: s= "aaaabbaa"
Output: "aabbaa"
Explanation: The longest palindromic substring is "aabbaa". 
Input: s = "abc"
Output: "a"
Explanation: "a", "b", and "c" are all palindromes of the same length, but "a" appears first. 
Input: s = "abacdfgdcaba" 
Output: "aba" 
Explanation: The longest palindromic substring is "aba", which occurs twice. The first occurrence is returned.
Constraints:
1 ≤ s.size() ≤ 103

Company Tags
ZohoAccoliteAmazonMicrosoftSamsungMakeMyTripVisaWalmartGoogleQualcommGroupon
*/


class Solution {
    // Static method to find the longest palindromic substring
    static String longestPalindrome(String s) {
        // code here
        String longpalindrome="";
        for(int i=1;i<s.length()-1;i++){
            int left=i;
            int right=i;
            while((left>=0&&right<s.length())&&(s.charAt(left)==s.charAt(right))){
                left--;
                right++;
            }
            String pali=s.substring(left+1,right);
            if(longpalindrome.length()<pali.length()){
                longpalindrome=pali;
            }
            left=i-1;
            right=i;
            while((left>=0&&right<s.length())&&(s.charAt(left)==s.charAt(right))){
                left--;
                right++;
            }
            pali=s.substring(left+1,right);
            if(longpalindrome.length()<pali.length()){
                longpalindrome=pali;
            }
            
        }
        if(longpalindrome.length()==1){
            longpalindrome=s.substring(0,1);
        }
        return longpalindrome;
    }
