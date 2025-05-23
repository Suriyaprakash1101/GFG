/*
Possible Words From Phone Digits
Difficulty: MediumAccuracy: 52.79%Submissions: 66K+Points: 4Average Time: 20m
Given a keypad as shown in the diagram, and an array arr[ ], your task is to list all possible words in any order which can be generated by pressing numbers from array.



Examples :

Input: arr[] = [2, 3]
Output: ad ae af bd be bf cd ce cf
Explanation: When we press 2, 3 total possible words are 3 x 3 = 9.
Input: arr[] =[3, 4, 5]
Output: dgj dgk dgl dhj dhk dhl dij dik dil egj egk egl ehj ehk ehl eij eik eil fgj fgk fgl fhj fhk fhl fij fik fil
Explanation: When we press 3, 4, 5 total possible words are 3 x 3 x 3 = 27.
Input: arr[] =[2]
Output: a b c
Explanation: When we press 2 total possible words are 3.
Constraints:
1 ≤ arr.size() ≤ 10
2 ≤ arr[i] ≤ 9
*/
class Solution {
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        String[]a={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder digits=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            digits.append(arr[i]);
        }
        return combination("",digits.toString(),a);
    }
    public static ArrayList<String> combination(String p,String up,String[]a){
        if(up.isEmpty()){
            ArrayList<String>l=new ArrayList<>();
            if(!p.isEmpty()){
                l.add(p);
            }
            return l;
        }
        ArrayList<String>l=new ArrayList<>();
        int digit=up.charAt(0)-'2';
        for(int i=0;i<a[digit].length();i++){
            char c=a[digit].charAt(i);
            l.addAll(combination(p+c,up.substring(1),a));
        }
        return l;
    }
}
