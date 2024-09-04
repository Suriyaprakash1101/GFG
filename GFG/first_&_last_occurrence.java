class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int a=first(arr,0,arr.length,x,n);
        int b=last(arr,0,arr.length,x,n);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
    int first(int arr[],int low, int high,int x,int n){
        if(low<=high){
            int mid=low+(high-low)/2;
            if((mid==0||x>arr[mid-1])&&(x==arr[mid])){
                return mid;
            }else if(x>arr[mid]){
                return first(arr,(mid+1),high,x,n);
            }else{
                return first(arr,low,(mid-1),x,n);
            }
        }
        return -1;
        
    }int last(int arr[],int low,int high,int x,int n){
        if(low<=high){
            int mid=low+(high-low)/2;
            if((mid==n-1||x<arr[mid+1])&&(x==arr[mid])){
                return mid;
            }else if(x<arr[mid]){
                return last(arr,low,(mid-1),x,n);
            }else{
                return last(arr,(mid+1),high,x,n);
            }
        }
        return -1;
        
    }
}
