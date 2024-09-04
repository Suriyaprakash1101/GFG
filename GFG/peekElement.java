//peak element
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]>=arr[i+1]){
               return i;
           }else{
               continue;
           }
       }
       return arr.length-1;
    }
}

