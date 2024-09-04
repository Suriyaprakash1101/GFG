//kth element of the two arrays
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        Stack<Integer>s=new Stack<>();
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                s.push(arr1[i]);
                i++;
            }
            else{
                
                s.push(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            s.push(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            s.push(arr2[j]);
            j++;
        }
        int tim=(n+m)-k;
        long val=0;
        for(int z=0;z<=tim;z++){
            val=s.pop();
        }
        return val;
        
    }
}


