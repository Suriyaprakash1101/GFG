//check the subsequence
lass Solution{
    boolean isSubSequence(String A, String B){
        int count=0;
        int start=0;
        for(int i=0;i<A.length();i++){
            
            char c=A.charAt(i);
            for(int j=start;j<B.length();j++){
                if(c==B.charAt(j)){
                    start=j+1;
                    count++;
                    break;
                }else{
                    continue;
                }
            }
        }
        if(count==A.length()){
            return true;
        }
        return false;
    }
}

