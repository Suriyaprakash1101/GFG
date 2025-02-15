/*
Merge Without Extra Space
Difficulty: MediumAccuracy: 32.01%Submissions: 285K+Points: 4Average Time: 20m
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output:
1 2 3 5 8 9
10 13 15 20
Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.
Input: a[] = [0, 1], b[] = [2, 3]
Output:
0 1
2 3
Explanation: After merging two sorted arrays we get 0 1 2 3.
Constraints:
1 <= a.size(), b.size() <= 105
0 <= a[i], b[i] <= 107

*/
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                i++;
            }
            else{
                int tem=a[i];
                a[i]=b[j];
                changeposition(b,j,tem);
                i++;
                
            }
            
        }
    }class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                i++;
            }
            else{
                int tem=a[i];
                a[i]=b[j];
                changeposition(b,j,tem);
                i++;
                
            }
            
        }
    }
    public static void changeposition(int[]b,int index,int value){
        boolean bo=false;
        for(int i=index;i<b.length-1;i++){
            if(b[i+1]>=value){
                b[i]=value;
                bo=true;
                break;
            }
            else{
                b[i]=b[i+1];
            }
            
        }
        if(!bo){
            b[b.length-1]=value;
        }
    }
}

    public static void changeposition(int[]b,int index,int value){
        boolean bo=false;
        for(int i=index;i<b.length-1;i++){
            if(b[i+1]>=value){
                b[i]=value;
                bo=true;
                break;
            }
            else{
                b[i]=b[i+1];
            }
            
        }
        if(!bo){
            b[b.length-1]=value;
        }
    }
}
