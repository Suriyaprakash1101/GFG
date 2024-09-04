// count ways to N'th stair
class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        long a=0;
        if(n==0){
            return a;
        }
        long count=1;
        while(n>1){
            n=n-2;
            count++;
        }
        return count;
    }
}


