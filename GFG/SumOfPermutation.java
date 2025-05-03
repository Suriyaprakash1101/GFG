/*
Sum of permutations
Difficulty: MediumAccuracy: 37.78%Submissions: 5K+Points: 4
Given distinct digits in an array arr[] (from 1 to 9), Your task is to complete the function getSum which finds the sum of all n-digit numbers that can be formed using these digits. 

Note: Since the output can be large take modulo 1000000007


Input: arr[] = [1, 2, 3]
Output: 1332 
Explanation: The possible permutations are 123, 132, 213, 231, 312, and 321. Hence,sum = 123 + 132 + 312 + 213 + 231 + 321 = 1332.
Input: arr[] = [1, 2]
Output: 33
Explanation: The possible permutations are 12,21. Hence,sum = 12+21 = 33.
Expected Time Complexity: O(n) important
Expected Auxiliary Space: O(1)
*/

class Solution {

    public int getSum(int arr[]) {
        // write code here
        int fact=1;
        int sum=0;
        for(int i=1;i<arr.length;i++){
            fact=(fact*i)%1000000007;
            sum=(sum+arr[i])%1000000007;
        }
        long multiply=0;
        long place=1;
        for(int i=0;i<arr.length;i++){
            multiply=(multiply+place)%1000000007;
            place=(place*10)%1000000007;
        }
        sum=(sum+arr[0])%1000000007;
        long res=(sum*fact)%1000000007;
        res=(res*multiply)%1000000007;
        return (int)res;//formula:sum*multiply*(n-1)!
        
    }
}
