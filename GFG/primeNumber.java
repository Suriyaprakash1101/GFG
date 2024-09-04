//given number is prime or not
class Solution{
    static int isPrime(int N){
        // code here
        if(N==1){
            return 0;
        }
        else if(N==2){
            return 1;
        }
        int n=(int)Math.sqrt(N);
        for(int i=2;i<=n;i++){
            if(N%i==0){
                return 0;
            }else{
                continue;
            }
        }
        return 1;
    }
}

