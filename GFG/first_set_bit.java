//find first set bit
class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
         int count=0;
    while(n>0)
    {
        count++;
        if((n&1)==1)
        {
            break;
        }
        n=n>>1;
        
    }
    
    return count;
    

    }
}
