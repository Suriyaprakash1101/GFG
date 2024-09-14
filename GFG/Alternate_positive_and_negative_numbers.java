//Alternative positive and negative nubmers
class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here.
        ArrayList<Integer>p=new ArrayList<>();
        ArrayList<Integer>n=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                p.add(arr.get(i));
            }
            else{
                n.add(arr.get(i));
            }
        }
        arr.removeAll(arr);
        int j=0;
        int k=0;
        int times=0;
        while(j<p.size()&&k<n.size()){
            if(times==0||times%2==0){
                arr.add(p.get(j));
                j++;
                times++;
            }
            else{
                arr.add(n.get(k));
                k++;
                times++;
            }
        }
        while(j<p.size()){
            arr.add(p.get(j));
            j++;
        }
        while(k<n.size()){
            arr.add(n.get(k));
            k++;
        }
    }
}


