/*
Pascal Triangle
Difficulty: MediumAccuracy: 23.68%Submissions: 120K+Points: 4Average Time: 20m
Given a positive integer n, return the nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

File:PascalTriangleAnimated2.gif

Examples:

Input: n = 4
Output: [1, 3, 3, 1]
Explanation: 4th row of pascal's triangle is [1, 3, 3, 1].
Input: n = 5
Output: [1, 4, 6, 4, 1]
Explanation: 5th row of pascal's triangle is [1, 4, 6, 4, 1].
Input: n = 1
Output: [1]
Explanation: 1st row of pascal's triangle is [1].
Constraints:
1 ≤ n ≤ 20

*/
lass Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(1);
        l.add(l1);
        for(int i=1;i<n;i++){
            l1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    l1.add(1);
                }
                else{
                    l1.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            l.add(l1);
        }
        return l.get(l.size()-1);
    }
}
