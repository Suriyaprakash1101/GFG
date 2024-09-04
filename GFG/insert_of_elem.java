//insert of an extra element
class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int count=0;
        for(int i=0;i<b.length;i++){
            if(a[i]!=b[i]){
                return i;
            }else{
                
                count++;
            }
            
        }
        return count;
    }
}
