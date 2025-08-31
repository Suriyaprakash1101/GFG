/*
Given an integer array arr[] of size n, find the inversion count in the array. Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Note: Inversion Count for an array indi
Input: arr[] = [1, 2, 3, 4, 5]
Output: 0
Explanation: There is no pair of indexes (i, j) exists in the given array such that arr[i] > arr[j] and i < j

Input: arr[] = [10, 10, 10]
Output: 0
Explanation: There is no pair of indexes (i, j) exists in the given array such that arr[i] > arr[j] and i < j
*/


class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int[]ans=new int[1];
        recursion(arr,ans,0,arr.length-1);
        return ans[0];
    }
    public static void recursion(int[]arr,int[]ans,int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        recursion(arr,ans,s,mid);
        recursion(arr,ans,mid+1,e);
        int i=s;
        int j=mid+1;
        while(i<=mid&&j<=e){
            if(arr[i]>arr[j]){
                ans[0]+=(mid-i+1);
                j++;
            }
            else{
                i++;
            }
        }
        merge(arr,s,mid,mid+1,e);
    }
    public static void merge(int[]arr,int start1,int end1,int start2,int end2){
        int i=start1;
        int j=start2;
        ArrayList<Integer>list=new ArrayList<>();
        
        while(i<=end1&&j<=end2){
            if(arr[i]<=arr[j]){
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(arr[j]);
                j++;
            }
        }
        while(i<=end1){
            list.add(arr[i]);
            i++;
        }
        while(j<=end2){
            list.add(arr[j]);
            j++;
        }
        for(int k=start1;k<=end2;k++){
            arr[k]=list.get(k-start1);
        }
    }
}
