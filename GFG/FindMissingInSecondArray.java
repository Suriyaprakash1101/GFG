//find missing in second array
class Solution
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long>l=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    count++;
                    
                }else{
                    continue;
                }
            }
            if(count==0){
                l.add(A[i]);
            }
        }
        return l;
    }
}
//another method
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<b.length;i++){
            map.put(b[i],b[i]);
        }
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                l.add(a[i]);
            }
        }
        return l;
    }
}


