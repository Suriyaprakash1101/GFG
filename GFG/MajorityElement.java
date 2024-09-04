//majority of element
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int r=-1;
        int max=max(a);
        int[]arr=new int[max+1];
        for(int i=0;i<a.length;i++){
            arr[a[i]]=arr[a[i]]+1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>(size/2)){
                r=i;
            }
        }
        return r;
    }
    static int max(int[]a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}

