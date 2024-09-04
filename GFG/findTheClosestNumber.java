//find the closest number
class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        int[]a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int val=Math.abs(arr[i]-k);
            a[i]=val;
        }
        int minind=0;
        for(int i=0;i<a.length;i++){
            if(a[minind]>=a[i]){
                minind=i;
            }
        
            
        }
        return arr[minind];
    }
}

