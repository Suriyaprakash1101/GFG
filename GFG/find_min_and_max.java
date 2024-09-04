//find the minimum and maximum in an array
class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=a[0];
        long max=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        Pair p1 = new Pair(min, max);
        return p1;
    }
}
