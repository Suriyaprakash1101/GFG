//remove duplicate elements from sorted array
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        
        int j=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]!=A[i+1]){
                A[j++]=A[i];
            }
        }
        A[j++]=A[A.length-1];
        return j;
    }
}

