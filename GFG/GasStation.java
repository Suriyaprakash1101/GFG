class Solution {
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int totgas=0;
        int totCost=0;
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            totCost+=cost[i];
        }
        if(totgas<totCost){
            return -1;
        }
        int setStart=0;
        totgas=0;
        totCost=0;
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            totCost+=cost[i];
            if(totCost>totgas){
                totCost=0;
                totgas=0;
                setStart=i+1;
            }
            
        }
        return setStart<gas.length?setStart:-1;
        
    }
}
/*approach
first check to total gas and total cost value, if cost is greater than the total gas then return -1
set start as 0 because we start from index 0, after that at any point of time total cost is greater then the total gas then we predict that it is not the start position.
we move to the next index.*/
