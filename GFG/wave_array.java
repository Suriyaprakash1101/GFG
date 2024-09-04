//wave array
class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=1;i<a.length;i+=2){
            int tem=a[i];
            a[i]=a[i-1];
            a[i-1]=tem;
        }
        int j=0;
        while(j<a.length-n){
            System.out.print(a[j]+" ");
            j++;
        }
        
    }
}
        

