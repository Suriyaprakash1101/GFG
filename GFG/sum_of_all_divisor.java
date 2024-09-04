//sum of all divisor 
class Solution{
    static long sumOfDivisors(int N){
        // code here
        long a=0;
        long num=1;
        long sum=0;
        
        while(num<=N){
            a=add(num);
            sum=sum+a;
            num++;
        }
        return sum;
    }public static long add(long num){
            long sum=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    sum=sum+i;
                }
            }
            return sum;
    }
}
//another method
class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+(N/i)*i;
        }
        return sum;
        
            
    }
}
