//check if a number is divisible by 8
class Solution{
    int DivisibleByEight(String s){
        //code here
        if(s.length()<3){
            int a=Integer.parseInt(s);
            if(a%8==0){
                return 1;
            }
        }
        else{
            char[]ch=s.toCharArray();
            StringBuffer sb=new StringBuffer();
            for(int i=ch.length-4;i<ch.length;i++){
                sb.append(ch[i]);
            }
            String st=sb.toString();
            int a=Integer.parseInt(st);
            if(a%8==0){
                return 1;
            }
            return -1;
        }
        return -1;
    }
}


