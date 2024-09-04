//find missing and repeating
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[]a=new int[2];
        int[]ar=new int[n+1];
        for(int i=0;i<arr.length;i++){
            ar[arr[i]]=ar[arr[i]]+1;
        }
        for(int i=1;i<ar.length;i++){
            if(ar[i]==0){
                a[1]=i;
            }
            if(ar[i]>1){
                a[0]=i;
            }
            else{
                continue;
            }
        }
        
        return a;
        
    }
}


