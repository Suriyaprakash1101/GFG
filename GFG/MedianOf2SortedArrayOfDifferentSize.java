//median of 2 sorted array of different size
class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int[]arr=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
        int median=0;
        if(arr.length%2!=0){
            median=(arr.length+1)/2;
        }
        else{
           median=(arr.length)/2;
           int add=arr[median-1]+arr[median];
           if(add%2==0){
               return add/2;
           }
           else{
               double val=(add/2)+0.5;
               return val;
           }
           
        }
        return arr[median-1];
       
    }
}


