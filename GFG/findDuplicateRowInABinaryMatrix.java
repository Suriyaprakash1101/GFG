//find the duplicate row in the binary matrix
class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<m;i++){
            int num=matrix[i][0];
            for(int j=i+1;j<m;j++){
                if(num==matrix[j][0]){
                    int count=analyse(matrix,i,j,n);
                    if(count==matrix[i].length){
                        l.add(j);
                    }
                }
            }
        }
        ArrayList<Integer>l2=new ArrayList<>();
        for(int k:l){
            if(!l2.contains(k)){
                l2.add(k);
            }
        }
        Collections.sort(l2);
        return l2;
    }
    public static int analyse(int[][]matrix,int i,int j,int c){
        int count=0;
        for(int k=0;k<c;k++){
            if(matrix[i][k]==matrix[j][k]){
                count++;
            }
        }
        return count;
    }
}

