/*
Validate an IP Address
Difficulty: MediumAccuracy: 11.22%Submissions: 284K+Points: 4
You are given a string s in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., "172.16.254.1"

A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255)

Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Examples :

Input: s = "222.111.111.111"
Output: true
Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range.
Input: s = "5555..555"
Output: false
Explanation: "5555..555" is not a valid. IPv4 address, as the middle two portions are missing.
Input: s = "0.0.0.255"
Output: false
Constraints:
1<= |s| <=15
*/
class Solution {

    public boolean isValid(String s) {
        // Write your code here
        
        int dotcount=0;
        int val=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                if(s.charAt(i-1)!='.'){
                    dotcount++;
                }
                String sbstr=sb.toString();
                if(sbstr.length()>=2){
                    if(sbstr.charAt(0)=='0'){
                        return false;
                    }
                    else{
                        int num=Integer.valueOf(sbstr);
                        if(!(num>=0&&num<=255)){
                            return false;
                        }
                    }
                }
                sb.delete(0,sb.length());
                
                
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        int num=Integer.valueOf(sb.toString());
        
        if(dotcount==3&& num>=0&&num<=255){
            return true;   
        }
        return false;
    }
}
