//find the leader in the given array
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
        int rightmax=arr[n-1];
        list.add(rightmax);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=rightmax){
                rightmax=arr[i];
                list.add(rightmax);
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}

