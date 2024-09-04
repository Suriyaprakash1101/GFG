//search and insert the element at position
class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int a=0;
        int count=0;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]<k){
                count++;
                a=Arr[i];
            }else{
                break;
            }
        }
        return count;
    }
}
