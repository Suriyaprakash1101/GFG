//Sum of upper and lower triangle
class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer>l=new ArrayList<>();
        int a=upper(matrix);
        int b=lower(matrix);
        l.add(a);
        l.add(b);
        return l;
    }
    public static int upper(int[][]matrix){
        int sum=0;
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=k;j<matrix.length;j++){
                sum=sum+matrix[i][j];
                
            }
            k++;
        }
        return sum;
    }
    public static int lower(int[][]matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                sum=sum+matrix[i][j];
            }
        }
        return sum;
    }
}

