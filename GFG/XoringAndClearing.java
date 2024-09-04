//xoring and clearing 
class Solution {
    public void printArr(int n, int arr[]) {
        // code here
        int num=0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        
    }

    public void setToZero(int n, int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public void xor1ToN(int n, int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++){
            int xor=arr[i]^i;
            arr[i]=xor;
        }
    }
}

