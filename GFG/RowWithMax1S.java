//row with max 1s
lass Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int[]a=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
                a[i]=count;
                
        }
        
        int max = Arrays.stream(a).max().getAsInt(); 
        if(max!=0){
            for(int i=0;i<a.length;i++){
                if(a[i]==max){
                    return i;
                }
            }
        }
        return -1;
    }
    
    
}

