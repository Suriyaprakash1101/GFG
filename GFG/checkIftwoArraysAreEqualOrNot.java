//check if the two arrays are equal or not
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        if(A.length!=B.length){
            return false;
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

