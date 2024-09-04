//cound odd even
class Solution
{
    public int[] countOddEven(int[] arr, int n)
    {
        // Code here
        int[]a=new int[2];
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        a[0]=odd;
        a[1]=even;
        return a;
    }
}

