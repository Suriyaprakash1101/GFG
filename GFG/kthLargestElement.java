//kth largest element 
class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        Arrays.sort(arr);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(arr[arr.length-1-i]);
            
        }
        
        return list;
    }
}
