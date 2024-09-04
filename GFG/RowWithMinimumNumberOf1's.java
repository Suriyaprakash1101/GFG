//row with minimum number of 1's 
class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int min=a[0].length;
        int index=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            
            if(count<min){
                min=count;
                index=i;
            }
        }
        
        return index+1;
    }
};

