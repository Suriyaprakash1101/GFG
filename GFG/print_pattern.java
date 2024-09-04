//print pattern
class Solution{
    public List<Integer> pattern(int N){
        // code here
        ArrayList<Integer>l=new ArrayList<>();
        int a=0;
        int tem=N;
        l.add(N);
        if(N<=0){
            return l;
        }
        while(true){
            a=decrease(tem);
            if(a<=0){
                l.add(a);
                break;
            }
            l.add(a);
            tem=a;
        }
        while(true){
            int b=increase(a);
            if(b==N){
                l.add(b);
                break;
            }
            l.add(b);
            a=b;
        }
        return l;
      
        
    }
    public static int decrease(int n){
        return n-5;
    }
    public static int increase(int n){
        return n+5;
    }
}
