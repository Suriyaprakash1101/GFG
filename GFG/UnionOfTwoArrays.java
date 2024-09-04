//union of two arrays
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            l.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            l.add(b[j]);
        }
        // for(int i:l){
        //     if(l.contains(i)){
        //         l.remove(i);
        //     }
        // }
        Set<Integer> s = new LinkedHashSet<Integer>(l); 
        int si=s.size();
        return si;
        
    }
}

